package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.sql.Date;

@Path("/hello")
@Produces("application/json")
public class ExampleResource {

    @GET
    public Example hello() {
      Example tst = new Example();
      tst.setTest(Date.valueOf("1966-11-04"));
      return tst;
    }
}