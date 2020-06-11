package jtdatabase.codegenerator.core;

import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;

/**
 * <pre>
 * Created on 2020/6/3 22:27
 * by @author JeramTough
 * </pre>
 */
public interface CompletedCallback {

    void onCompleted(ConfigBuilder config);
}
