package com.example.springvault.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("notion")
public class NotionConfigProperties {

    private final String apiUrl;
    private final String apiVersion;
    private final String authToken;
    private final String databaseUser;
    private final String databasePassword;

    public NotionConfigProperties(String apiUrl, String apiVersion, String authToken, String databaseUser, String databasePassword) {
        this.apiUrl = apiUrl;
        this.apiVersion = apiVersion;
        this.authToken = authToken;
        this.databaseUser = databaseUser;
        this.databasePassword = databasePassword;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }
}
