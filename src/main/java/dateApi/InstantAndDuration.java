package main.java.dateApi;

import java.time.Duration;
import java.time.Instant;

public class InstantAndDuration {
    public static void main(String[] args) {
        // Do thoi gian 1 service truy van co so du lieu
        Instant start = Instant.now();

        simulateTask();

        Instant end = Instant.now();
        // Tinh toan khoang thoi gian giua luc bat dau va ket thuc
        Duration timeElapsed = Duration.between(start, end);
        // In ra ket qua
        System.out.println("Thoi gian xu ly tac vu: " + timeElapsed.toMillis() + " milliseconds");
    }

    private static void simulateTask(){
        try{
            //Gia lap viec tai du lieu mat 2 giay
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
