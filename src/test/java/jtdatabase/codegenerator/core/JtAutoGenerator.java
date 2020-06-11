package jtdatabase.codegenerator.core;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.AbstractTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * <pre>
 * Created on 2020/6/3 20:56
 * by @author JeramTough
 * </pre>
 */
public class JtAutoGenerator extends AutoGenerator {

    private static final Logger logger = LoggerFactory.getLogger(AutoGenerator.class);

    private CompletedCallback completedCallback;

    /**
     * 模板引擎
     */
    private AbstractTemplateEngine templateEngine;


    public void execute() {

        // 初始化配置
        config = new ConfigBuilder(getPackageInfo(), getDataSource(), getStrategy(),
                getTemplate(),
                getGlobalConfig());
        injectionConfig.setConfig(config);
        if (null == templateEngine) {
            // 为了兼容之前逻辑，采用 Velocity 引擎 【 默认 】
            templateEngine = new VelocityTemplateEngine();
        }
        // 模板引擎初始化执行文件输出
        templateEngine.init(this.pretreatmentConfigBuilder(config));

        synchronized (this) {
            templateEngine.mkdirs().batchOutput();
        }

        if (completedCallback != null) {
            completedCallback.onCompleted(config);
        }

        logger.debug("==========================文件生成完成！！！==========================");
    }

    public void open() {
        templateEngine.open();
    }

    public List<TableInfo> getTableInfoList() {
        if (null == config) {
            config = new ConfigBuilder(getPackageInfo(), getDataSource(), getStrategy(),
                    getTemplate(),
                    getGlobalConfig());
            return config.getTableInfoList();
        }
        return null;
    }

    public CompletedCallback getCompletedCallback() {
        return completedCallback;
    }

    public void setCompletedCallback(CompletedCallback completedCallback) {
        this.completedCallback = completedCallback;
    }
}
