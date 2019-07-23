package datahandling;

import datahandling.date.service.Impl.DemoDateImpl;
import datahandling.numbers.service.Impl.DemoNumbersImpl;

public class Main {
    public static void main(String[] args) {
        DemoDateImpl demoDate = new DemoDateImpl();
        DemoNumbersImpl demoNumbers = new DemoNumbersImpl();

        demoDate.runDemoDate();

        demoNumbers.runDemoNumbers();
    }
}
