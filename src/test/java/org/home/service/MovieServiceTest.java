package org.home.service;

import org.home.entity.MovieRepository;
import org.home.service.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

class MovieServiceTest {
    @Inject
    MovieRepository movieRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void createMovie() {
    }
}