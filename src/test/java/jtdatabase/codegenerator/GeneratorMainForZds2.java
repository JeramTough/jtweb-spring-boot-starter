package jtdatabase.codegenerator;

import jtdatabase.codegenerator.adapter.GeneratorConfigAdapter;
import jtdatabase.codegenerator.core.CodeGeneratorAgent;

/**
 * <pre>
 * Created on 2020/5/23 16:15
 * by @author JeramTough
 * </pre>
 */
public class GeneratorMainForZds2 {

    public static void main(String[] args) {
        CodeGeneratorAgent codeGeneratorAgent = new CodeGeneratorAgent(new GeneratorConfigAdapter() {
            @Override
            public String getProjectName() {
                return "soa";
            }

            @Override
            public String getOutputDir() {
                return "/developer/Codes/IdeaCodes/spring-boot-starter-jtweb2/src/test/code" +
                        "/zds3";
            }

            @Override
            public String getAuthor() {
                return "WeiBoWen";
            }

           /* @Override
            public String getUrl() {
                return "jdbc:sqlserver://1.117.99.165:21434;DatabaseName=zds";
            }*/
           @Override
           public String getUrl() {
               return "jdbc:mysql://1.117.99.165:20003/zds?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai";
           }

            @Override
            public String getDriverName() {
                return "com.mysql.jdbc.Driver";
            }

           /* @Override
            public String[] getUsernameAndPassword() {
                return new String[]{"sa", "zds@163.com"};
            }*/

            @Override
            public String[] getUsernameAndPassword() {
                return new String[]{"root", "ssd@123456"};
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
