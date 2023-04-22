package org.home.tutorial.quarkusmaven;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import java.util.List;
public class MovieRepository implements PanacheRepository<Movie> {
    public List<Movie> findByCountry(String country){

        return list("SLEECT m FROM Movie m WHERE m.country =?1 ORDER BY " +
        "DESC", country);
    }
}
