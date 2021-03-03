package com.springframework.petclinic;

import com.springframework.petclinic.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PetClinicApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        myController.sayHello();
    }


}
