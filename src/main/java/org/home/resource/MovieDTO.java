package org.home.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.net.URL;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MovieDTO {
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
