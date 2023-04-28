package org.home.entity;

import org.home.entity.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie movie;
    @BeforeEach
    void setUp() throws MalformedURLException {
        movie = Movie.builder().title("java learning").id(12L)
                .director("hamed").country("IR").language("FA")
                .officialSite(new URL("http://localhost"))
                .build();
    }

    @Test
    void movieNotNull(){
        assertNotNull(movie);
    }
    @Test
    void getId() {
        assertEquals(12,movie.getId());
    }

    @Test
    void getTitle() {
        assertEquals("java learning", movie.getTitle());
    }

    @Test
    void getDirector() {
        assertEquals("hamed",movie.getDirector());
    }

    @Test
    void getCountry() {
        assertEquals("IR", movie.getCountry());
    }

    @Test
    void getOfficialSite() {
        assertEquals("http://localhost", movie.getOfficialSite().toString());
    }

    @Test
    void getLanguage() {
        assertEquals("FA", movie.getLanguage());
    }

    @Test
    void setId() {
        movie.setId(120L);
        assertEquals("120", movie.getId().toString());
    }

    @Test
    void setTitle() {
        movie.setTitle("java learning test");
        assertEquals("java learning test", movie.getTitle());
    }

    @Test
    void setDirector() {
        movie.setDirector("director");
        assertEquals("director", movie.getDirector());
    }

    @Test
    void setCountry() {
       // movie
        movie.setCountry("RI");
        assertEquals("RI", movie.getCountry());
    }

    @Test
    void setOfficialSite() throws MalformedURLException {
        movie.setOfficialSite(new URL("http://localhost:1025"));
        assertEquals("http://localhost:1025", movie.getOfficialSite().toString());
    }

    @Test
    void setLanguage() {
        movie.setLanguage("PE");
        assertEquals("PE", movie.getLanguage());
    }
}