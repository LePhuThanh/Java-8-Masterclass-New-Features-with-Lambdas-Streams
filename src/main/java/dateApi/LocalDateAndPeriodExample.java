package main.java.dateApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateAndPeriodExample{
    public static void main(String[] args) {
        // Lay ngay hien tai
        LocalDate toDay  = LocalDate.now();
        System.out.println("Ngay hien tai: " + toDay);

        //Tao mot ngay cu the (sinh nhat)
        LocalDate birthDay = LocalDate.of(1999, Month.OCTOBER, 7);
        LocalDate birthDay2 = LocalDate.of(1999, 10, 7);
        System.out.println("Sinh nhat: " + birthDay);
        System.out.println("Sinh nhat: " + birthDay2);

        //Tinh khoang cach giua ngay sinh va ngay hien tai
        Period age = Period.between(birthDay, toDay);
        System.out.println("Tuoi cua ban la: " + age.getYears() + " nam, "
                            + age.getMonths() + " thang, va " + age.getDays() + " ngay");

        // Cong them mot nam vao ngay hien tai
        LocalDate nextYear = toDay.plusYears(1);
        System.out.println("Ngay nay vao nam sau: " + nextYear);
    }
}
