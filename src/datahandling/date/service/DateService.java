package datahandling.date.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateService {

    public void Age() {
        LocalDateTime bDay = LocalDateTime.of(1998, 04, 24, 15, 28, 12);
        LocalDateTime nowDate = LocalDateTime.now();
        double ageSeconds = nowDate.getSecond() - bDay.getSecond();
        double ageMinutes = nowDate.getMinute() - bDay.getMinute();
        double ageHours = nowDate.getHour() - bDay.getHour();
        double ageDays = nowDate.getDayOfYear() - bDay.getDayOfYear();
        double ageMonths = nowDate.getMonthValue() - bDay.getMonthValue();
        double ageYears = nowDate.getYear() - bDay.getYear();

        System.out.println(ageSeconds + " seconds");
        System.out.println(ageMinutes + " minutes");
        System.out.println(ageHours + " hours");
        System.out.println(ageDays + " days");
        System.out.println(ageMonths + " months");
        System.out.println(ageYears + " years");
    }

    public void DifferentDate() {
        double countDays;
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateOne = LocalDate.parse("25.04.2014", formatDate);
        LocalDate dateTwo = LocalDate.parse("25.02.2014", formatDate);
        double daysFirstDate = dateOne.getDayOfYear();
        double daysSecondDate = dateTwo.getDayOfYear();
        if (dateOne.isBefore(dateTwo)) {
            countDays = daysSecondDate - daysFirstDate;
        } else {
            countDays = daysFirstDate - daysSecondDate;
        }
        System.out.println("Количество дней между " + dateOne + " и " + dateTwo + " = " + countDays);
    }

    public void ParsingDate() {
        String date = "Mon, Jul 22, 2018 12:10:12 PM";

        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, LLL dd, yyyy hh:mm:ss a");
            LocalDate parseDate = LocalDate.parse(date, dateTimeFormatter);
            System.out.println(date + " parsing to " + parseDate);
            DateTimeFormatter tryFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate tryParseDate = LocalDate.parse(date, tryFormatter);
            System.out.println(date + " parsing to " + tryParseDate);
        } catch (DateTimeParseException ex) {
            ex.printStackTrace();
        }
    }
}
