package ca.by.project_x;

import org.springframework.boot.SpringApplication;

public class BootApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RootConfiguration.class);
        app.run(args);
    }

}
