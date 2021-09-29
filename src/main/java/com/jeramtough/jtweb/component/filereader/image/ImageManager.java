package com.jeramtough.jtweb.component.filereader.image;

import java.io.File;

/**
 * <pre>
 * Created on 2021/2/7 15:13
 * by @author WeiBoWen
 * </pre>
 */
public interface ImageManager {

    File get(File imageFile,int imageQuality);

}
