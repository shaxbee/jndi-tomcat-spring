package com.sap.sg;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Path("/")
@Component
public class RootService {
	
	@Resource(name="bean/Foo")
	Foo foo;
	
	@GET
	public String helloWorld() {
		return foo.getSource();
	}
}
