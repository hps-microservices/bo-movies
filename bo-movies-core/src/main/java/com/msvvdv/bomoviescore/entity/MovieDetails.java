package com.msvvdv.bomoviescore.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class MovieDetails {
    @JsonProperty("Title")
    private	String	title;
    @JsonProperty("Year")
    private	Integer	year;
    @JsonProperty("Director")
    private	String	director;
    @JsonProperty("Writer")
    private	String	writer;
    @JsonProperty("Actors")
    private	String	actors;
    @JsonProperty("Plot")
    private	String	description;
    @JsonProperty("imdbRating")
    private	Double	imdbRating;
}
