package com.lydck.boot.conf;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext acw = new AnnotationConfigWebApplicationContext();
		acw.register(MyMvcConfig.class);
		acw.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(acw));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
