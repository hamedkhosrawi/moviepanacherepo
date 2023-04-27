package org.home;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface MovieApi {

    @GET
    @Path("{title}")
    Response getMovieDetails(@PathParam("title") String title);
    @POST
    Response createMovie(MovieDTO movieDTO);

}
