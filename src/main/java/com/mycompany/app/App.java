package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Hello world!
 */
@SpringBootApplication
@RestController
public class App {

    static final Logger logger= LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("#context is starting....");
       SpringApplication.run(App.class,args);
        logger.info("#context is started....");
    }

    @PostConstruct
    public void init(){
        logger.info("#context is started From POST CONSTRUCT....");
    }

    @GetMapping("/hi")
    public ResponseEntity<?> sayHello()
    {
        return ResponseEntity.ok("HELLO");
    }


}
