package com.jeramtough.jtweb.component.start;

import com.jeramtough.jtlog.facade.L;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

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
        serverNamespace =
                webServerInitializedEvent.getApplicationContext().getServerNamespace();
    }

    @EventListener
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        L.info("The project has launched successfully! ");

        if (serverNamespace == null) {
            serverNamespace = "";
        }
        else {
            serverNamespace = "/" + serverNamespace;
        }

        L.info("swagger: http://127.0.0.1:%d%s/doc.html?cache=1&lang=zh",
                port, serverNamespace);
    }
}

