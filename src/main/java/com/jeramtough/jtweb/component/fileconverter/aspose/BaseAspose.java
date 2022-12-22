package com.jeramtough.jtweb.component.fileconverter.aspose;

import com.aspose.pdf.License;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Date;

/**
 * <pre>
 * Created on 2022/9/16 上午12:04
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseAspose {

    /**
     * aspose-words:jdk17:22.5 版本
     */
    protected void registerWord_v_22_5() throws Exception {
        Class<?> zzjXClass = Class.forName("com.aspose.words.zzjX");
        Constructor<?> constructor = zzjXClass.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Object zzjXInstance = constructor.newInstance();

        // zzZ7O
        java.lang.reflect.Field zzZ7O = zzjXClass.getDeclaredField("zzZ7O");
        zzZ7O.setAccessible(true);
        zzZ7O.set(zzjXInstance, new Date(Long.MAX_VALUE));

        // zzBf
        java.lang.reflect.Field zzZfB = zzjXClass.getDeclaredField("zzZfB");
        zzZfB.setAccessible(true);
        Class<?> zzYP3Class = Class.forName("com.aspose.words.zzYP3");
        java.lang.reflect.Field zzBfField = zzYP3Class.getDeclaredField("zzBf");
        zzBfField.setAccessible(true);
        zzZfB.set(zzjXInstance, zzBfField.get(null));

        // zzZjA
        java.lang.reflect.Field zzZjA = zzjXClass.getDeclaredField("zzZjA");
        zzZjA.setAccessible(true);
        zzZjA.set(null, zzjXInstance);


        Class<?> zzCnClass = Class.forName("com.aspose.words.zzCn");
        java.lang.reflect.Field zzZyx = zzCnClass.getDeclaredField("zzZyx");
        zzZyx.setAccessible(true);
        zzZyx.set(null, 128);
        java.lang.reflect.Field zzZ8w = zzCnClass.getDeclaredField("zzZ8w");
        zzZ8w.setAccessible(true);
        zzZ8w.set(null, false);
    }

    /**
     * aspose-cells:22.6 版本有效
     */
    protected void registerExcel_v_22_6() throws Exception {
        String licenseExpiry = "20991231";

        // License
        Class<?> licenseClass = Class.forName("com.aspose.cells.License");
        java.lang.reflect.Field a = licenseClass.getDeclaredField("a");
        a.setAccessible(true);
        a.set(null, licenseExpiry);

        // k65
        Class<?> k65Class = Class.forName("com.aspose.cells.k65");
        java.lang.reflect.Field k65A = k65Class.getDeclaredField("a");
        k65A.setAccessible(true);

        Constructor<?> constructor = k65Class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Object k65Instance = constructor.newInstance();
        k65A.set(null, k65Instance);

        java.lang.reflect.Field k56C = k65Class.getDeclaredField("c");
        k56C.setAccessible(true);
        k56C.set(k65Instance, licenseExpiry);

        // e0n
        Class<?> e0nClass = Class.forName("com.aspose.cells.e0n");
        java.lang.reflect.Field e0nA = e0nClass.getDeclaredField("a");
        e0nA.setAccessible(true);
        e0nA.set(null, false);

    }

    /**
     * aspose-slides:21.10 版本有效
     */
    protected void registerPPT_v_21_10() throws Exception {
        Date licenseExpiry = new Date(Long.MAX_VALUE);

        Class<?> publicClass = Class.forName("com.aspose.slides.internal.of.public");
        Object publicInstance = publicClass.newInstance();

        java.lang.reflect.Field publicTry = publicClass.getDeclaredField("try");
        publicTry.setAccessible(true);
        publicTry.set(null, publicInstance);

        java.lang.reflect.Field publicInt = publicClass.getDeclaredField("int");
        publicInt.setAccessible(true);
        publicInt.set(publicInstance, licenseExpiry);

        java.lang.reflect.Field publicNew = publicClass.getDeclaredField("new");
        publicNew.setAccessible(true);
        publicNew.set(publicInstance, licenseExpiry);

        java.lang.reflect.Field publicIf = publicClass.getDeclaredField("if");
        publicIf.setAccessible(true);
        publicIf.set(publicInstance, 2);

        Class<?> nativeClass = Class.forName("com.aspose.slides.internal.of.native");
        java.lang.reflect.Field nativeDo = nativeClass.getDeclaredField("do");
        nativeDo.setAccessible(true);
        nativeDo.set(null, publicInstance);
    }

    /**
     * aspose-pdf:21.7 版本有效
     */
    protected void registerPdf_v_21_7() throws Exception {
        Date licenseExpiry = new Date(Long.MAX_VALUE);
        Class<?> l9yClass = Class.forName("com.aspose.pdf.l9y");
        Constructor<?> constructor = l9yClass.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Object l9yInstance = constructor.newInstance();

        // lc
        java.lang.reflect.Field lc = l9yClass.getDeclaredField("lc");
        lc.setAccessible(true);
        lc.set(l9yInstance, licenseExpiry);
        // ly
        java.lang.reflect.Field ly = l9yClass.getDeclaredField("ly");
        ly.setAccessible(true);
        ly.set(l9yInstance, licenseExpiry);

        // l0if
        java.lang.reflect.Field l0if = l9yClass.getDeclaredField("l0if");
        l0if.setAccessible(true);

        Class<?> l9nClass = Class.forName("com.aspose.pdf.l9n");
        java.lang.reflect.Field lfField = l9nClass.getDeclaredField("lf");
        lfField.setAccessible(true);
        Object lf = lfField.get(null); // 处理枚举
        l0if.set(l9yInstance, lf);

        Class<?> l9yLfClass = Class.forName("com.aspose.pdf.l9y$lf");
        java.lang.reflect.Field l9y$lf = l9yLfClass.getDeclaredField("lI");
        l9y$lf.setAccessible(true);
        l9y$lf.set(null, l9yInstance);


        Class<?> l19jClass = Class.forName("com.aspose.pdf.l19j");
        java.lang.reflect.Field l19jlI = l19jClass.getDeclaredField("lI");
        l19jlI.setAccessible(true);
        l19jlI.set(null, 128);
        java.lang.reflect.Field l19jLf = l19jClass.getDeclaredField("lf");
        l19jLf.setAccessible(true);
        l19jLf.set(null, false);
    }


}
