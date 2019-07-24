package datahandling.numbers.service;

import java.math.BigDecimal;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class NumbersService {
    public void areaCircle() {
        int scale = 50;
        double radius = 9;
        BigDecimal radiusSquare = new BigDecimal(pow(radius, 2));
        BigDecimal area = BigDecimal.valueOf(PI).multiply(radiusSquare);
        area.setScale(scale);
        System.out.println("Radius circle - " + radius + " , area of circle = " + area);
    }

    public void CheckDoublle() {
        String doubleOne = "0.1";
        String doubleTwo = "0.15";
        String doubleThree = "0.25";
        if (Double.parseDouble(doubleOne) + Double.parseDouble(doubleTwo) == Double.parseDouble(doubleThree)) {
            System.out.println("Числа " + doubleOne + " и " +doubleTwo + " являются суммой " + doubleThree);
        } else {
            System.out.println("Числа " + doubleOne + " и " +doubleTwo + " не являются суммой " + doubleThree);
        }
    }

    public void MaxMin() {
        double a = 12.5;
        double b = 15.2;
        double c = 13.1;

        double maximumNumber = max(max(a,b),c);
        double minimalNumber = min(min(a,b),c);

        System.out.println("Numbers: " + a + " , " + b + " , " + c);
        System.out.println("Max number is " + maximumNumber);
        System.out.println("Min number is " + minimalNumber);
    }
}
