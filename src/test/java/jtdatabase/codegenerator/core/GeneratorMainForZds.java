package jtdatabase.codegenerator.core;

import jtdatabase.codegenerator.adapter.GeneratorConfigAdapter;

/**
 * <pre>
 * Created on 2020/5/23 16:15
 * by @author JeramTough
 * </pre>
 */
public class GeneratorMainForZds {

    public static void main(String[] args) {
        CodeGeneratorAgent codeGeneratorAgent = new CodeGeneratorAgent(new GeneratorConfigAdapter() {
            @Override
            public String getProjectName() {
                return "zds";
            }

            @Override
            public String getOutputDir() {
                return "E:\\Codes\\IdeaCodes\\spring-boot-starter-jtweb2\\src\\test" +
                        "\\code\\GeneratorMainForZds";
            }

            @Override
            public String getAuthor() {
                return "WeiBoWen";
            }

            @Override
            public String getUrl() {
                return "jdbc:sqlserver://192.168.0.213:1433;DatabaseName=zds";
            }

            @Override
            public String getDriverName() {
                return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            }

            @Override
            public String[] getUsernameAndPassword() {
                return new String[]{"sa", "sa123"};
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
                return "net.ssd.apiserver.apigather";
            }
        });

        codeGeneratorAgent.startGenerating();
    }
}
