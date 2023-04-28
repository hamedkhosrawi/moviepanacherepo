package org.home.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.home.entity.Movie;
import org.home.exception.MovieException;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MovieService {

    @ConfigProperty(name="exception.message.movie.title")
    public String MOVIE_NULL;



    private List<Movie> movieList = new ArrayList<>();

    public List<Movie> createMovie(Movie movie){
        if (movie == null){
            throw new MovieException(MOVIE_NULL);
        }
        return movieList;
    }
}
