package datahandling.date.service.Impl;

import datahandling.date.service.DateService;
import datahandling.date.service.DemoDateInterface;

public class DemoDateImpl implements DemoDateInterface {
    @Override
    public void runDemoDate() {
        DateService dateService = new DateService();

        System.out.println("Задание 1.1: ");
        dateService.Age();

        System.out.println("Задание 1.2: ");
        dateService.DifferentDate();

        System.out.println("Задание 1.3: ");
        dateService.ParsingDate();
    }
}
