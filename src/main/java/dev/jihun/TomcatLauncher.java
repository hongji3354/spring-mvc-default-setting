package dev.jihun;

import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class TomcatLauncher {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        String webappDir = "src/main/webapp/";

        tomcat.setPort(8080);
        tomcat.addWebapp("/", new File(webappDir).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}
