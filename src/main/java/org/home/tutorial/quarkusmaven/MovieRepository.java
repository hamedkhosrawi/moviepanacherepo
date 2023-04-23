package org.home.tutorial.quarkusmaven;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
@ApplicationScoped
public class MovieRepository implements PanacheRepository<Movie> {
    public List<Movie> findByCountry(String country){

<<<<<<< HEAD
        return list("SLEECT m FROM Movie m WHERE m.country =?1 ORDER BY " +
        "DESC", country);
=======
        return list("SELECT m FROM Movie m WHERE m.country = ?1 ORDER BY id" +
                " DESC", country);
>>>>>>> f251195 (microProfile Health Added.)
    }
}
