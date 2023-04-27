package org.home;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import java.util.List;

@Path("/movies")
@Tag(name = "Movie Resource", description = "Movie Rest APIs")
public class MovieResource {

    @Inject
    MovieRepository movieRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        List<Movie> movies = movieRepository.listAll();
        return Response.ok(movies).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response getById(@PathParam("id") Long id){

        return movieRepository.findByIdOptional(id)
        .map(movie -> Response.ok(movie).build() )
        .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("title/{title}")
    public Response getByTitle(@PathParam("title") String title){
        return movieRepository.find("title", title)
        .singleResultOptional()
        .map(movie -> Response.ok(movie).build())
        .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("country/{country}")
    public Response getByCountry(@PathParam("country") String country){
        List<Movie> movies = movieRepository.findByCountry(country);
        return Response.ok(movies).build();
    }


    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Movie movie){
        movieRepository.persist(movie);

        if (movieRepository.isPersistent(movie)) {
            return Response.ok(movie).build();
        }
        return Response.status(Status.BAD_REQUEST).build();

    }




}



