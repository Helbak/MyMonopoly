package code;


import code.domain.Action;
import code.domain.Gamer;
import code.domain.Property;
import code.domain.Step;

import code.service.ActionService;
import code.service.GamerService;
import code.service.PropertyService;
import code.service.StepService;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@AllArgsConstructor
public class MonopolyApplication implements ApplicationRunner {
    private StepService stepService;
    private GamerService gamerService;
    private PropertyService propertyService;
    private ActionService actionService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MonopolyApplication.class, args);
        System.out.println("Context bean count: " + context.getBeanDefinitionCount());
    }


    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        for (int i = 0; i <= 38; i++) {
            stepService.createStep(i);
        }
        Gamer bank = new Gamer("BANK", "black", 14000, stepService.getStepByPosition(0));
        gamerService.addGamer(bank);
        Property property1 = new Property(stepService.getStepByPosition(1), bank, "Krym", 1, 2,1, "Yalta", 60, 2, 10, 30, 90, 160, 250, 50, 50, 0, false);
        propertyService.addProperty(property1);
        Property property3 = new Property(stepService.getStepByPosition(3), bank, "Krym", 1, 2, 1, "Sevastopol", 60, 4, 20, 60, 180, 320,450, 50, 50, 0, false);
        propertyService.addProperty(property3);
        Action action2 = new Action(stepService.getStepByPosition(2), "Pay property tax - $ 200");
        actionService.addAction(action2);
        Action action4 = new Action(stepService.getStepByPosition(4),"Take $ 200 for development");
        actionService.addAction(action4);
        Property property5 = new Property(stepService.getStepByPosition(5), bank, "Transport", 3, 4, 1, "Yalta Airport", 200, 25, 25, 25, 25, 25, 25, 0, 0, 0, false);
        propertyService.addProperty(property5);
        Property property6 = new Property(stepService.getStepByPosition(6), bank, "Kharkiv", 3, 3, 1, "Kluchkivska street", 100, 6, 30, 90, 270, 400, 550 , 50, 50, 0, false);
        propertyService.addProperty(property6);
        Action action7 = new Action(stepService.getStepByPosition(7),"Take $ 50 for development");
        actionService.addAction(action7);
        Property property8 = new Property(stepService.getStepByPosition(8), bank, "Kharkiv", 3, 3, 1, "Freedom square", 100, 8, 30, 90, 270, 400, 550 , 50, 50, 0, false);
        propertyService.addProperty(property8);
        Property property9 = new Property(stepService.getStepByPosition(9), bank, "Kharkiv", 3, 3, 1, "Sumska street", 120, 8, 40, 100, 300, 450, 600 , 50, 50, 0, false);
        propertyService.addProperty(property9);
        Action action10 = new Action(stepService.getStepByPosition(10),"Еhis is a prison friend .. pay $ 50 for freedom");
        actionService.addAction(action10);
    }
}
