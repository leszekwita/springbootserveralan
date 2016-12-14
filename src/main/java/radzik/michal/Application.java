package radzik.michal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Created by Michal on 2016-12-13.
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "radzik.michal", excludeFilters = @ComponentScan.Filter(value = org.springframework.context.annotation.Configuration.class, type = FilterType.ANNOTATION))
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
    }


