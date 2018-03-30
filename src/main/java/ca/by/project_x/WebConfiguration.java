package ca.by.project_x;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
public class WebConfiguration {

    @Bean
    public RestTemplate restTemplate(@Autowired RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public ErrorProperties errorProperties(ServerProperties serverProperties) {
        return serverProperties.getError();
    }

}
