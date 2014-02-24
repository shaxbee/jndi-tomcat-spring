package com.github.shaxbee;

import javax.inject.Named;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Named
public class RootService {
	
	@Resource(name="bean/Foo")
	Foo foo;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Foo helloWorld() {
		return foo;
	}
}
