package com.example.demo.config.datasources;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource.postgres")
public record PostgresDataSourceDTO(String url, String driverClassName, String username, String password) {
}
