package org.home;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class MovieDTOTest {

    private MovieDTO movieDTO;
    @BeforeEach
    void setUp() throws MalformedURLException {
        movieDTO = MovieDTO.builder().title("java learning").id(12L)
                .director("hamed").country("IR").language("FA")
                .officialSite(new URL("http://localhost"))
                .build();
    }

    @Test
    void movieNotNull(){
        assertNotNull(movieDTO);
    }
    @Test
    void getId() {
        assertEquals(12, movieDTO.getId());
    }

    @Test
    void getTitle() {
        assertEquals("java learning", movieDTO.getTitle());
    }

    @Test
    void getDirector() {
        assertEquals("hamed", movieDTO.getDirector());
    }

    @Test
    void getCountry() {
        assertEquals("IR", movieDTO.getCountry());
    }

    @Test
    void getOfficialSite() {
        assertEquals("http://localhost", movieDTO.getOfficialSite().toString());
    }

    @Test
    void getLanguage() {
        assertEquals("FA", movieDTO.getLanguage());
    }

    @Test
    void setId() {
        movieDTO.setId(120L);
        assertEquals("120", movieDTO.getId().toString());
    }

    @Test
    void setTitle() {
        movieDTO.setTitle("java learning test");
        assertEquals("java learning test", movieDTO.getTitle());
    }

    @Test
    void setDirector() {
        movieDTO.setDirector("director");
        assertEquals("director", movieDTO.getDirector());
    }

    @Test
    void setCountry() {
        // movie
        movieDTO.setCountry("RI");
        assertEquals("RI", movieDTO.getCountry());
    }

    @Test
    void setOfficialSite() throws MalformedURLException {
        movieDTO.setOfficialSite(new URL("http://localhost:1025"));
        assertEquals("http://localhost:1025", movieDTO.getOfficialSite().toString());
    }

    @Test
    void setLanguage() {
        movieDTO.setLanguage("PE");
        assertEquals("PE", movieDTO.getLanguage());
    }
}