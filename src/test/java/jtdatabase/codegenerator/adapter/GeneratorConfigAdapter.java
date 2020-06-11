package jtdatabase.codegenerator.adapter;

/**
 * <pre>
 * Created on 2020/5/23 16:25
 * by @author JeramTough
 * </pre>
 */
public interface GeneratorConfigAdapter {

    String getProjectName();

    String getOutputDir();

    String getAuthor();

    String getUrl();

    String getDriverName();

    String[] getUsernameAndPassword();

    String getSuperControllerClass();

    /**
     * 是否第一个单词是业务前缀，根据业务前缀划分
     */
    boolean hasBusinessPrefix();

    String getParentPackageName();
}
