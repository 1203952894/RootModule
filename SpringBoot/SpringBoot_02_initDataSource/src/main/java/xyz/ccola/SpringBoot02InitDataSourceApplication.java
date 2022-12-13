package xyz.ccola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringBoot02InitDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02InitDataSourceApplication.class, args);
    }

}
