package be.sha2001.featureflags;

import be.sha2001.featureflags.configuration.UnleashConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableConfigurationProperties(UnleashConfiguration.class)
@EnableAspectJAutoProxy
public class FeatureFlagsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeatureFlagsApplication.class, args);
    }


}
