package main.java.dateApi;

import java.time.LocalDate;
import java.time.Period;

public class RentalContractManager {
    public static void  main(String[] args){
        /*
        Use case: Quan ly ky han hop dong thue nha
        Tinh huong thuc te: Mot he thong quan ly bat dong san can theo doi ngay ky ket hop dong thue nha, tinh so thang/nam con lai cho den
        khi het han va gui thong bao cho chu nha neu hop dong sap het han trong vong 30 ngay
        */

        //Ngay ky ket hop dong thue (co the lay tu co so du lieu)
        LocalDate contractStartDate = LocalDate.of(2022,10,1);
        System.out.println("Ngay ky hop dong: " + contractStartDate);

        //Ky han hop dong thue (vi du: 2 nam)
        int contractTermInYears = 2;

        //Tinh ngay hey han hop dong
        LocalDate contractEndDate = contractStartDate.plusYears(contractTermInYears);
        System.out.println("Ngay het han hop dong la: " + contractEndDate);

        //Ngay hien tai
        LocalDate toDay = LocalDate.now();

        //Kiem tra xem hop dong da het han hay chua
        if(toDay.isAfter(contractEndDate)){
            System.out.println("Hop dong da het han!");
        }else {
            // Tinh khoang thoi gian con lai den ngay het han
            Period timeLeft = Period.between(toDay, contractEndDate);
            System.out.println("Con lai: " + timeLeft.getYears() + " nam, "
                    + timeLeft.getMonths() + " thang, " + timeLeft.getDays() + " ngay cho den khi het hop dong");

            //Kiem tra neu hop dong sap het han trong vong 30 ngay
            if(timeLeft.getYears() == 0 && timeLeft.getMonths() == 0 && timeLeft.getDays() < 30){
                System.out.println("Thong bao: Hop dong se het han trong : " + timeLeft.getDays() + " ngay!");
            }else {
                System.out.println("Hop dong chua sap het han!");
            }
        }

    }
}
