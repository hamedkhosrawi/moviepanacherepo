package org.home;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MovieService {

    private List<Movie> movieList = new ArrayList<>();

    public List<Movie> createMovie(Movie movie){
        if (movie == null){
            throw new NullPointerException("Input cannot be null.");
        }
        return movieList;
    }
}
