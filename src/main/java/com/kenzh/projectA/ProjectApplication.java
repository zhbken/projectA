package com.kenzh.projectA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

   /* @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
*/
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProjectApplication.class, args);
    }

}