package ru.MyApp.Server;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import ru.MyApp.Server.Config.WebConfig;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by 1 on 06.02.2017.
 */
public class ApplicationInit implements WebApplicationInitializer {

    private final static String DISPATCHER = "dispather";

    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext =
                new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(annotationConfigWebApplicationContext));
        ServletRegistration.Dynamic servlet =
                servletContext.addServlet(DISPATCHER,new DispatcherServlet(annotationConfigWebApplicationContext));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
