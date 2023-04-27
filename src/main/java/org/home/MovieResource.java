package org.home;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

public class MovieResource implements MovieApi {

    @Inject
    MovieService movieService;
    @Override
    public Response getMovieDetails(String title) {
        return null;
    }

    @Override
    public Response createMovie(MovieDTO movieDTO) {
        return null;
    }
}
