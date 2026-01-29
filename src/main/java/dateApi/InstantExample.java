package main.java.dateApi;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("Thoi gian hien tai: " + now);

        //Plus 1 hour
        Instant oneHourLater = now.plusSeconds(3600);
        System.out.println("Thoi gian sau 1 gio: " + oneHourLater);

        //Tao mot cot moc thoi gian tu timestamp
        Instant specificTime = Instant.ofEpochSecond(1630345650);
        System.out.println("Moc thoi gian cu the: " + specificTime);
    }
}
