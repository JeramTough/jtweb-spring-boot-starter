package com.jeramtough.jtweb.action.starter;

import com.jeramtough.jtlog.facade.L;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;

import javax.servlet.ServletContext;
import java.net.InetAddress;
import java.net.UnknownHostException;

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
        serverNamespace =
                applicationReadyEvent.getApplicationContext().getBean(
                        ServletContext.class).getContextPath();

        if (serverNamespace == null) {
            serverNamespace = "";
        }


        String ipAddress;
        try {
            InetAddress address = InetAddress.getLocalHost();
            ipAddress = address.getHostAddress();

        }
        catch (UnknownHostException e) {
            ipAddress = "127.0.0.1";
        }
        String swaggerAddress = String.format(
                "swagger: http://%s:%d%s/doc.html?cache=1&lang=zh",
                ipAddress, port, serverNamespace);
        L.info(swaggerAddress + "\n项目已经成功启动^0^y\nThe project has launched successfully!");
    }
}

