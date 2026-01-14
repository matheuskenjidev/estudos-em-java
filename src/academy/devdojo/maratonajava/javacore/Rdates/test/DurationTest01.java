package academy.devdojo.maratonajava.javacore.Rdates.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);


        Duration between = Duration.between(now, nowAfterTwoYears);
        Duration between2 = Duration.between(timeNow, timeMinus7Hours);
        Duration between3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d = Duration.ofDays(20);//retorna a quantidade de dias em horas



        System.out.println(between);
        System.out.println(between2);
        System.out.println(between3);
        System.out.println(d);
        System.out.println(Duration.ofMinutes(1800));//retorna como seria os minutos colocados de argumento em horas
    }
}
