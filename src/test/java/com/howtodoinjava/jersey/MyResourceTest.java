package com.howtodoinjava.jersey;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * hello there j fsgfljhljh j 
 * @author manjusuresh
 * 
 */
public class MyResourceTest {
	public static final URI BASE_URI = UriBuilder.fromUri("http://localhost").port(8082).build();
	private HttpServer server;
	private WebTarget target;

	@Before
	public void setUp() throws Exception {

		ResourceConfig rc = new ResourceConfig(JerseyService.class);
		server = GrizzlyHttpServerFactory.createHttpServer(BASE_URI, rc);

		server.start();
		Client c = ClientBuilder.newClient();
		target = c.target(BASE_URI);
	}

	@After
	public void tearDown() throws Exception {
		server.shutdown();
	}

	/**
	 * Test to see that the message "Got it!" is sent in the response.
	 */
	@Test
	public void testGetIt() {
		String responseMsg = target.path("message").request().get(String.class);
		assertEquals("{\"name\" : \"Hello World !! - suresh babu Averineni\"}", responseMsg);
	}
}