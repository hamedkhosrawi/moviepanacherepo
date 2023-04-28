package org.home.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.home.entity.Movie;
import org.home.entity.MovieRepository;
import org.home.exception.MovieException;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MovieService {

    @ConfigProperty(name="exception.message.movie.title")
    public String MOVIE_NULL;

    @Inject
    MovieRepository movieRepository;

    private List<Movie> movieList = new ArrayList<>();

    @Transactional
    public List<Movie> createMovie(Movie movie){
        if (movie == null){
            throw new MovieException(MOVIE_NULL);
        }
        return movieList;
    }
}
