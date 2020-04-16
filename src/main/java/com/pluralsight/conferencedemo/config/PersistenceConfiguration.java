package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        //builder.url("jdbc:postgresql://localhost:5432/conference_app");
        //builder.url("jdbc:postgresql://localhost:5432/postgres.pluralsight_springboot");
        builder.url("jdbc:mariadb://localhost:3306/pluralsight_springboot");
        builder.username("root");
        builder.password("");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }

}
