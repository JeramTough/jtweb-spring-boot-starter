package jtdatabase.codegenerator;

import jtdatabase.codegenerator.adapter.GeneratorConfigAdapter;
import jtdatabase.codegenerator.core.CodeGeneratorAgent;

/**
 * <pre>
 * Created on 2020/5/23 16:15
 * by @author JeramTough
 * </pre>
 */
public class GeneratorMainForMoniter {

    public static void main(String[] args) {
        CodeGeneratorAgent codeGeneratorAgent = new CodeGeneratorAgent(new GeneratorConfigAdapter() {
            @Override
            public String getProjectName() {
                return "monitor";
            }

            @Override
            public String getOutputDir() {
                return "E:\\Codes\\IdeaCodes\\spring-boot-starter-jtweb2\\src\\test\\code\\Moniter";
            }

            @Override
            public String getAuthor() {
                return "WeiBoWen";
            }

            @Override
            public String getUrl() {
                return "jdbc:mysql://192.168.0.213:3306/SSD_MONITOR?useUnicode=true" +
                        "&useSSL=false&characterEncoding=utf8";
            }

            @Override
            public String getDriverName() {
                return "com.mysql.jdbc.Driver";
            }

            @Override
            public String[] getUsernameAndPassword() {
                return new String[]{"hnd", "123456"};
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
