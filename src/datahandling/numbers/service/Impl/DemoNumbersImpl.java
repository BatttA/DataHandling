package datahandling.numbers.service.Impl;

import datahandling.numbers.service.DemoNumbersInterface;
import datahandling.numbers.service.NumbersService;

public class DemoNumbersImpl implements DemoNumbersInterface {
    @Override
    public void runDemoNumbers() {
        NumbersService numbersService = new NumbersService();

        System.out.println("Задание 2.1: ");
        numbersService.areaCircle();

        System.out.println("Задание 2.2: ");
        numbersService.CheckDoublle();

        System.out.println("Задание 2.3: ");
        numbersService.MaxMin();
    }
}
