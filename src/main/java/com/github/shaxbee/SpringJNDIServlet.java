package com.github.shaxbee;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.spi.spring.container.servlet.SpringServlet;

@WebServlet(
    urlPatterns={"/*"}, 
    loadOnStartup=1,
    initParams = {
        @WebInitParam(name=JSONConfiguration.FEATURE_POJO_MAPPING, value="true")
    })
public class SpringJNDIServlet extends SpringServlet {
	private static final long serialVersionUID = 2172566429134975602L;
}
