package be.sha2001.featureflags.configuration;

import io.getunleash.DefaultUnleash;
import io.getunleash.Unleash;
import io.getunleash.util.UnleashConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "unleash")
@Getter
@Setter
public class UnleashConfiguration {


    private String appName;
    private String apiUrl;
    private String apiKey;

    // Getter and setter for appName and apiUrl

    @Bean
    public Unleash unleash() {
        UnleashConfig config =  UnleashConfig.builder()
                .appName(appName)
                .instanceId(appName)
                .unleashAPI(apiUrl)
                .apiKey(apiKey)
                .build();

        return new DefaultUnleash(config);
    }
}