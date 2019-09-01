package com.gosee.ie;

import com.gosee.ie.properties.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class IeApplication {

    public static void main(String[] args) {
        SpringApplication.run(IeApplication.class, args);
    }

}
