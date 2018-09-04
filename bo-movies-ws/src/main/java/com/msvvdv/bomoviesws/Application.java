package com.msvvdv.bomoviesws;

import com.msvvdv.bomoviescore.config.ModuleConfiguration;
import com.msvvdv.bomoviescore.config.MongoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                Application.class,
                ModuleConfiguration.class,
                MongoConfiguration.class
        ).run(args);
    }
}
