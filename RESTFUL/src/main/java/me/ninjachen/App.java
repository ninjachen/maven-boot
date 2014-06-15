package me.ninjachen;

/**
 * Hello world!
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) throws Exception {
//        Object[] classes = new Object[](2);

        SpringApplication.run(App.class);
    }
}