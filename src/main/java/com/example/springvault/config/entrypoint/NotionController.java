package com.example.springvault.config.entrypoint;

import com.example.springvault.config.NotionConfigProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/notion")
public class NotionController {

    private final NotionConfigProperties notionConfigProperties;

    public NotionController(NotionConfigProperties notionConfigProperties) {
        this.notionConfigProperties = notionConfigProperties;
    }

    @GetMapping
    public Map<String, String> printAllProps() {
        return Map.of("apiUrl", notionConfigProperties.getApiUrl(),
                "databaseUser", notionConfigProperties.getDatabaseUser(),
                "databasePassword", notionConfigProperties.getDatabasePassword(),
                "apiVersion", notionConfigProperties.getApiVersion(),
                "authToken", notionConfigProperties.getAuthToken());
    }
}
