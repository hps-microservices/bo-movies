package com.msvvdv.bomoviescore.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.Duration;

@NoArgsConstructor
@Document(collection = "user")
@Getter
public class Movie {
    @Id
    @Field("_id")
    private String idMongo;
    @Setter
    private Long id;
    private String name;
    private Duration duration;
    private String gender;
    private BigDecimal price;
}
