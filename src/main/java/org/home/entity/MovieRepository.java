package org.home.entity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.home.entity.Movie;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
@ApplicationScoped
public class MovieRepository implements PanacheRepository<Movie> {
    public List<Movie> findByCountry(String country){


        return list("SLEECT m FROM Movie m WHERE m.country =?1 ORDER BY " +
        "DESC", country);



    }
}
