package ProgrammingBasics2;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDogmas = Integer.parseInt(scanner.nextLine());
        String typeOfJoinery = scanner.nextLine();
        String shipmentMethod = scanner.nextLine();
        double discount = 0;
        int price = 0;
        if (typeOfJoinery.equals("90*130")) {
            if (numberOfDogmas > 30) {
                price = 110;
                discount = price - (price * 0.05);
            }
            if (numberOfDogmas > 60) {
                price = 110;
                discount = price - (price * 0.08);

            }

        } else if (typeOfJoinery.equals("100*150")) {
            if (numberOfDogmas > 40) {
                price = 140;
                discount = price - (price * 0.06);

            }
            if (numberOfDogmas > 80) {
                price = 140;
                discount = price - (price * 0.10);

            }


        } else if (typeOfJoinery.equals("130*180")) {
            if (numberOfDogmas > 20) {
                price = 190;
                discount = price - (price * 0.07);
            }
         if (numberOfDogmas > 50) {
            price = 190;
            discount = price - (price * 0.12);
        }
    }else if (typeOfJoinery.equals("200*300")){
            if (numberOfDogmas >25) {
                price = 250;
                discount = price - (price * 0.09);
            }
        }else if (numberOfDogmas > 50){
                price =250;
                discount = price-(price*0.14);
            }

        if (numberOfDogmas <= 10) {
            System.out.println("Invalid order");



        }
    }
}
//НЕ Е РЕШЕНА