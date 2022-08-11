package com.example.springvault;

import com.example.springvault.config.NotionConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class SpringvaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringvaultApplication.class, args);
    }

}
