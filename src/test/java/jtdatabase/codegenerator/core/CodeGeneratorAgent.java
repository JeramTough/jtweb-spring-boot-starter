package jtdatabase.codegenerator.core;

import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.FileType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtlog.facade.L;
import jtdatabase.codegenerator.adapter.GeneratorConfigAdapter;

import java.io.File;
import java.util.*;
import java.util.concurrent.*;

/**
 * <pre>
 * Created on 2020/5/23 15:56
 * by @author JeramTough
 * </pre>
 */
public class CodeGeneratorAgent {

    private final GeneratorConfigAdapter configAdapter;
    private JtAutoGenerator codeAutoGenerator;
    private InjectionConfig injectionConfig;
    private CountDownLatch countDownLatch;

    private static final String DTO_PATH = "dto_path";

    public List<String> tableNames=new ArrayList<>();


    public CodeGeneratorAgent(GeneratorConfigAdapter configAdapter) {
        this.configAdapter = configAdapter;
        init();
    }

    void init() {
        // 代码生成器
        codeAutoGenerator = new JtAutoGenerator();
        initGlobalConfig();
        initStrategyConfig();
        initCustomTemplateConfig();
        initDtoTemplateConfig();


    }


    protected void initGlobalConfig() {
        GlobalConfig globalConfig = new GlobalConfig();
//        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setOutputDir(configAdapter.getOutputDir());
        globalConfig.setAuthor(configAdapter.getAuthor());
        globalConfig.setOpen(true);
        //实体属性 Swagger2 注解
        globalConfig.setSwagger2(true);
        globalConfig.setActiveRecord(false);
        globalConfig.setServiceName("%sService");
        System.out.println(globalConfig.getServiceName());
        codeAutoGenerator.setGlobalConfig(globalConfig);

        //数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl(configAdapter.getUrl());
        dataSourceConfig.setDriverName(configAdapter.getDriverName());
        dataSourceConfig.setUsername(configAdapter.getUsernameAndPassword()[0]);
        dataSourceConfig.setPassword(configAdapter.getUsernameAndPassword()[1]);
        codeAutoGenerator.setDataSource(dataSourceConfig);
    }

    protected void initStrategyConfig() {
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperEntityClass(configAdapter.getSuperControllerClass());
        strategy.setEntityLombokModel(false);
        strategy.setRestControllerStyle(true);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //包含前缀的数据库表将会省略掉前缀
//        strategy.setTablePrefix("ap");
        codeAutoGenerator.setStrategy(strategy);
    }


    protected void initCustomTemplateConfig() {

        //指定自定义模板路径, 位置：/resources/templates/entity2.java.ftl(或者是.vm)
        //注意不要带上.ftl(或者是.vm), 会根据使用的模板引擎自动识别
        TemplateConfig templateConfig = new TemplateConfig()
                .setEntity("/templates/entity1.java");
        templateConfig.setController("/templates/controller.java");

        //配置自定义模板
        codeAutoGenerator.setTemplate(templateConfig);

        // 自定义属性注入配置
        injectionConfig = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }

            @Override
            public void initTableMap(TableInfo tableInfo) {
                if (tableInfo == null) {
                    L.arrive();
                }
                else{
                    tableNames.add(tableInfo.getName());
                }

                if (tableInfo.getFields() != null) {
                    for (TableField tableField : tableInfo.getFields()) {
                        //命名重构
                        String propertyName = tableField.getPropertyName();
                        String columnName=tableField.getColumnName();

                        if (!columnName.contains("_")) {
                            String s = columnName.substring(0, 1);
                            String e = columnName.substring(1, columnName.length());
                            propertyName = s.toLowerCase() + e;
                        }
                        else if (columnName.equalsIgnoreCase("ID")) {
                            propertyName = "id";
                        }
                        else if (columnName.equalsIgnoreCase("LDATE")) {
                            propertyName = "ldate";
                        }
                        else if (columnName.equalsIgnoreCase("LIME")) {
                            propertyName = "ltime";
                        }
//                        tableField.setName(name);
                        tableField.setPropertyName(propertyName);

                        //把注释的回车换成#号
                        String comment = tableField.getComment();
                        if (comment != null) {
                            comment = comment.replace("\r\n", " # ");
                            tableField.setComment(comment);
                        }
                    }
                }
            }
        };
        codeAutoGenerator.setCfg(injectionConfig);
    }

    protected void initDtoTemplateConfig() {
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig("/templates/dto1.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                Map<String, String> pathInfoMap =
                        CodeGeneratorAgent.this.codeAutoGenerator.getConfig().getPathInfo();
                String entityPath = pathInfoMap.get(ConstVal.ENTITY_PATH);
                String dtoPath = new File(
                        entityPath).getParentFile().getAbsolutePath() + File.separator + "dto";
                String dtoFilePath = dtoPath +
                        File.separator + tableInfo.getEntityName() + "Dto.java";
                pathInfoMap.put(DTO_PATH, dtoPath);
                return dtoFilePath;
            }
        });
        injectionConfig.setFileOutConfigList(focList);
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void startGenerating() {

        File file = new File(configAdapter.getOutputDir());
        if (file.exists()) {
            file.delete();
        }

        if (configAdapter.hasBusinessPrefix()) {
            List<TableInfo> tableInfoList = codeAutoGenerator.getTableInfoList();
            Set<String> businessPrefixSet = new HashSet<>();
            for (TableInfo tableInfo : tableInfoList) {
                String tableName = tableInfo.getName();
                String businessPrefix = tableName.split("_")[0];
                businessPrefixSet.add(businessPrefix);
            }

            countDownLatch = new CountDownLatch(businessPrefixSet.size());
            ExecutorService executor = new ThreadPoolExecutor(1, Integer.MAX_VALUE,
                    60L, TimeUnit.SECONDS,
                    new LinkedBlockingQueue<Runnable>());
//        executor = Executors.newSingleThreadExecutor();
            for (String prefix : businessPrefixSet) {
                executor.execute(() -> {
                    System.out.println(countDownLatch.getCount());
                    generating(prefix);
                });
            }

            try {
                executor.shutdown();
                countDownLatch.await();
                codeAutoGenerator.open();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            generating();
            codeAutoGenerator.open();
        }
    }

    //******************

    private void generating(String businessName) {
        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        //根据业务名分成模块，适合微服务架构
        packageConfig.setParent(
                configAdapter.getParentPackageName() + "." + configAdapter.getProjectName() +
                        "." + businessName);
        packageConfig.setController(
                "action.controller");
        packageConfig.setMapper("dao.mapper");
        packageConfig.setXml("dao.mapper.xml");
        packageConfig.setEntity("model.entity");

        //根据业务名内分包
        /*packageConfig.setParent(
                configAdapter.getParentPackageName() + "." + configAdapter.getProjectName());
        packageConfig.setController(
                "action.controller."+businessName);
        packageConfig.setMapper("dao.mapper."+businessName);
        packageConfig.setXml("dao.mapper.xml."+businessName);
        packageConfig.setEntity("model.entity."+businessName);*/

        codeAutoGenerator.setPackageInfo(packageConfig);

        injectionConfig.setFileCreate(
                new IFileCreate() {
                    @Override
                    public boolean isCreate(ConfigBuilder configBuilder, FileType fileType,
                                            String filePath) {

                        if (filePath != null) {
                            // 判断自定义文件夹是否需要创建
                            synchronized (CodeGeneratorAgent.this) {
                                checkDir(filePath);
                            }
                            File file = new File(filePath);
                            String businessPrefix = file.getName().substring(0,
                                    businessName.length());
                            boolean isNeededBusiness = businessName.equalsIgnoreCase(
                                    businessPrefix);

                            //是需要的业务前缀
                            return isNeededBusiness;
                        }
                        else {
                            return false;
                        }
                    }
                }
        );

        codeAutoGenerator.execute();
        countDownLatch.countDown();
    }

    private void generating() {
        // 包配置
        PackageConfig packageConfig = new PackageConfig();
//        packageConfig.setModuleName(businessName);
        packageConfig.setParent(
                configAdapter.getParentPackageName() + "." + configAdapter.getProjectName());

        packageConfig.setController(
                "action.controller");
        packageConfig.setMapper("dao.mapper");
        packageConfig.setXml("dao.mapper.xml");
        packageConfig.setEntity("model.entity");
        codeAutoGenerator.setPackageInfo(packageConfig);

        injectionConfig.setFileCreate(
                new IFileCreate() {
                    @Override
                    public boolean isCreate(ConfigBuilder configBuilder, FileType fileType,
                                            String filePath) {

                        if (filePath != null) {
                            // 判断自定义文件夹是否需要创建
                            synchronized (CodeGeneratorAgent.this) {
                                checkDir(filePath);
                            }
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                }
        );

        codeAutoGenerator.execute();
    }


}
