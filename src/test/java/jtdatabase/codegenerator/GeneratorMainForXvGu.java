package jtdatabase.codegenerator;

import jtdatabase.codegenerator.adapter.GeneratorConfigAdapter;
import jtdatabase.codegenerator.core.CodeGeneratorAgent;

/**
 * <pre>
 * Created on 2020/5/23 16:15
 * by @author JeramTough
 * </pre>
 */
public class GeneratorMainForXvGu {

    public static void main(String[] args) {
        CodeGeneratorAgent codeGeneratorAgent = new CodeGeneratorAgent(new GeneratorConfigAdapter() {
            @Override
            public String getProjectName() {
                return "tianqingtask";
            }

            @Override
            public String getOutputDir() {
                return "E:\\Codes\\IdeaCodes\\spring-boot-starter-jtweb2\\src\\test\\code\\tianqingtask";
            }

            @Override
            public String getAuthor() {
                return "WeiBoWen";
            }

            @Override
            public String getUrl() {
                return "jdbc:xugu://10.159.90.77:5138/BENN_STDB?useSSL=false&serverTimezone=GMT%2B8&characterEncoding=utf-8";
            }

            @Override
            public String getDriverName() {
                return "com.xugu.pool.XgDataSource";
            }

            @Override
            public String[] getUsernameAndPassword() {
                return new String[]{"USR_GTZS", "123Qweasdzxc"};
            }

            @Override
            public String getSuperControllerClass() {
                return null;
            }

            @Override
            public boolean hasBusinessPrefix() {
                return false;
            }

            @Override
            public String getParentPackageName() {
                return "net.ssd";
            }
        });

        codeGeneratorAgent.startGenerating();
    }
}
