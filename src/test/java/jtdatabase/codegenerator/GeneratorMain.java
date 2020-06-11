package jtdatabase.codegenerator;

import jtdatabase.codegenerator.adapter.GeneratorConfigAdapter;
import jtdatabase.codegenerator.core.CodeGeneratorAgent;

/**
 * <pre>
 * Created on 2020/5/23 16:15
 * by @author JeramTough
 * </pre>
 */
public class GeneratorMain {

    public static void main(String[] args) {
        CodeGeneratorAgent codeGeneratorAgent = new CodeGeneratorAgent(new GeneratorConfigAdapter() {
            @Override
            public String getProjectName() {
                return "models";
            }

            @Override
            public String getOutputDir() {
                return "E:\\Codes\\IdeaCodes\\jtdatabase-spring-boot-starter\\src\\test\\code";
            }

            @Override
            public String getAuthor() {
                return "JeramTough";
            }

            @Override
            public String getUrl() {
                return "jdbc:mysql://localhost:3306/msy_headnews_db?useUnicode=true" +
                        "&useSSL=false&characterEncoding=utf8";
            }

            @Override
            public String getDriverName() {
                return "com.mysql.jdbc.Driver";
            }

            @Override
            public String[] getUsernameAndPassword() {
                return new String[]{"root", "123456"};
            }

            @Override
            public String getSuperControllerClass() {
                return null;
            }

            @Override
            public boolean hasBusinessPrefix() {
                return true;
            }

            @Override
            public String getParentPackageName() {
                return "com.jeramtough.msyheadnews.common";
            }
        });

        codeGeneratorAgent.startGenerating();
    }
}
