package ProgrammingBasics2;

import java.util.Scanner;


import java.util.Scanner;

    public class Harvest2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = Integer.parseInt(scanner.nextLine());
            double y = Double.parseDouble(scanner.nextLine());
            int z = Integer.parseInt(scanner.nextLine());
            int numWorkers = Integer.parseInt(scanner.nextLine());
            double allGrapes = y * x;
            double harvest = 0.40;
            // double oneMeters=y*0.40;
            double oneLiterForGrapes = 2.5;
            double wine =Math.ceil((allGrapes * harvest) / oneLiterForGrapes);
            double sum =Math.abs(wine-z);
            double liters =Math.ceil(sum / numWorkers);
            if (wine < z) {
                //System.out.println(sum);
                System.out.printf("It will be a tough winter! More %.0f liters wine needed.",sum);
            }else{
                System.out.printf("Good harvest this year! Total wine: %.0f liters.",wine);
                System.out.println();
                System.out.printf("%.0f liters left -> %.0f liters per person.",sum,liters);
            }
        }
}
