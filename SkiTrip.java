package ProgrammingBasics2;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String assessment = scanner.nextLine();
        double price = 0;
        double result=daysStay-1;

            if (typeOfRoom.equals("room for one person")) {
                price = result*18.00;
            } else if (typeOfRoom.equals("apartment")) {
                price = result * 25.00;
                if (daysStay<10) {
                    price *= 0.70;

                }
        else if (daysStay <= 15) {
                price =price*0.65;

            } else {
                    price = price * 0.50;
                }
            } else if (typeOfRoom.equals("president apartment")) {
                price = result*35.00;


        if (daysStay <10) {
            price = price * 0.90;
        }else if (daysStay <=15) {
            price = price * 0.85;
        }else {
            price = price * 0.80;
        }

            }
            if (assessment.equals("positive")){
                price=price*1.25;

            }else{
                price=price*0.90;


        }
        System.out.printf("%.2f",price);
    }
}
//НЕ РЕШЕНА