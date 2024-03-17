package org.example;

import org.example.winterFell.service.JohnSnowService;
import org.example.winterFell.serviceImpl.GodsWood;
import org.example.winterFell.serviceImpl.JohnSnowSericeImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan
@RestController
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        GodsWood godsWood = new GodsWood();
        godsWood.godsWoodCheck();

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        JohnSnowService johnSnowService = new JohnSnowSericeImpl();
        int check = johnSnowService.familyChart();
        System.out.println("SCHeck"+check);
        System.out.println("sdfkdj"+check);
        System.out.println("Main.main");
    }
}