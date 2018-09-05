package com.msvvdv.bomoviescore.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.Duration;

@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Document(collection = "movie")
public class Movie {
    @Id
    @Field("_id")
    private String idMongo;
    @Setter
    private Long id;
    private String name;
    private String gender;

}
