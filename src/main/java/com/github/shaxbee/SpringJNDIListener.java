package com.github.shaxbee;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;

@WebListener
public class SpringJNDIListener implements ServletContextListener,
		ServletRequestListener {

	private final static ContextLoaderListener context = new ContextLoaderListener();
	private final static RequestContextListener request = new RequestContextListener();

	@Override
	public void contextInitialized(ServletContextEvent event) {
		context.contextInitialized(event);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		context.contextDestroyed(event);
	}

	@Override
	public void requestInitialized(ServletRequestEvent event) {
		request.requestInitialized(event);
	}

	@Override
	public void requestDestroyed(ServletRequestEvent event) {
		request.requestDestroyed(event);
	}

}
