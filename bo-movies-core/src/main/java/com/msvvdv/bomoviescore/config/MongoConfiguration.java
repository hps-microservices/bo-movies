package com.msvvdv.bomoviescore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = {"com.msvvdv.bomoviescore.repository"})
public class MongoConfiguration {}
