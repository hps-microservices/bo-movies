package com.msvvdv.bomoviescore.dto;

import com.msvvdv.bomoviescore.entity.MovieDetails;
import lombok.*;

import java.math.BigDecimal;
import java.time.Duration;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Data
public class MovieDTO {
    private MovieDetails movieDetails;
    private Duration duration;
    private String gender;
    private BigDecimal price;
}
