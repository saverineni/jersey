package com.howtodoinjava.jersey;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.howtodoinjava.jersey.service.HelloServiceImpl;
  
@Path("/message")
public class JerseyService
{
	
	@Autowired
	private HelloServiceImpl impl;
	
    @GET
    public String getMsg()
    {
         return impl.call();
    }
}