package main.java.dateApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Thoi gian hien tai: " + now);
        //Tao mau dinh dang
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //Dinh dang LocalDateTime thanh chuoi
        String formatterDateTime = now.format(formatter);
        System.out.println("Thoi gian hien tai da duoc format: " + formatterDateTime);

    }
}
