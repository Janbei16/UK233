package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/calculator/add/")
public class addition {

    @GET
    @Path("{number1}/{number2}")
    public String addNumber(@PathParam("number1")int number1,@PathParam("number2")int number2) {
    
        int result = number1 + number2;
        return "The Result is: " + result;
    }
    
}
