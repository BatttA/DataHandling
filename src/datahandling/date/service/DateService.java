package datahandling.date.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

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
        String date = "Monday, July 22, 2019 12:10:12 PM";

        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a", Locale.US);
            DateTimeFormatter tryFormatter = DateTimeFormatter.ISO_DATE;
            System.out.println(date + " parsing to : " + tryFormatter.format(LocalDate.parse(date, dateTimeFormatter)));
        } catch (DateTimeParseException ex) {
            ex.printStackTrace();
        }
    }
}
