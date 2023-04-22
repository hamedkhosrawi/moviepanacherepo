package org.home.tutorial.quarkusmaven;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import java.net.URL;

@Schema(name = "Movie", description = "Movie Representation")
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Movie {

    @Id
    @GeneratedValue
    @Column(length = 100)
    @NotNull
    public Long id;
    @Schema(required = true)
    @Column(length = 100)
    @NotNull
    public String title;
    @Schema(required = true)
    @Column(length = 200)
    @NotNull
    public String director;
    @Schema(required = true)
    @Column(length = 150)
    @NotNull
    public String country;
    @Column(length = 150)
    private URL officialSite;
    @Column(length = 100)
    public String language;


}
