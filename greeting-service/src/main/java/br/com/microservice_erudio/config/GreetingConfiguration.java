package br.com.microservice_erudio.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greeting-service")
public record GreetingConfiguration(String greeting, String defaultValue) {
}
