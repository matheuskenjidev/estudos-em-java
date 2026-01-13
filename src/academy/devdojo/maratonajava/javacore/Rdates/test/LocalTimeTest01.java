package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 23, 12);
        System.out.println(time);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));

        System.out.println(LocalTime.MIN); //retorna a no começo dp dia(meia noite)
        System.out.println(LocalTime.MAX); //retona o final do dia (23:59:59:999)
    }
}
