package main.java.dateApi;

import java.time.Duration;
import java.time.Instant;

public class DurationExample {
    public static void main(String[] args) {
        Instant now = Instant.now();

        Instant twoMinutesLater = now.plus(Duration.ofMinutes(2));

        //Tinh khoang thoi gian giua hai moc thoi gian
        Duration duration = Duration.between(now,twoMinutesLater);
        System.out.println("Khoang thoi gian giua hien tai vaf 2 phut sau: " + duration.getSeconds() + " giay");

        //Tao Duration co dinh va cong no vao thoi gian hien tai
        Duration tenMinutes = Duration.ofMinutes(20);
        Instant tenMinutesLater = now.plus(tenMinutes);
        System.out.println("Thoi gian sau 10 phut: " + tenMinutesLater);

    }
}
