package com.jeramtough.jtweb.action.starter;

import com.jeramtough.jtlog.facade.L;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;

import javax.servlet.ServletContext;

/**
 * <pre>
 * Created on 2020/5/16 17:14
 * by @author JeramTough
 * </pre>
 */
public class BootStarterListener {

    private int port;
    private String serverNamespace;

    @EventListener
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        port = webServerInitializedEvent.getWebServer().getPort();
    }

    @EventListener
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        L.info("The project has launched successfully! ");

        serverNamespace =
                applicationReadyEvent.getApplicationContext().getBean(
                        ServletContext.class).getContextPath();

        if (serverNamespace == null ) {
            serverNamespace = "";
        }

        L.info("swagger: http://127.0.0.1:%d%s/doc.html?cache=1&lang=zh",
                port, serverNamespace);
    }
}

