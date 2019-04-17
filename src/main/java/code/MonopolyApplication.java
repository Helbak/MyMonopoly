package code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import code.domain.*;
//import code.service.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MonopolyApplication implements ApplicationRunner {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MonopolyApplication.class, args);
        System.out.println("Context bean count: " + context.getBeanDefinitionCount());
    }

    @Override
    public void run(ApplicationArguments arg0) throws Exception {



    }
}
