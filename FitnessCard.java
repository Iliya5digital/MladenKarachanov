package ProgrammingBasics2;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;
        if (symbol.equals("m")) {
            if (sport.equals("Gum")) {
                price = 42;
            } else if (sport.equals("Boxing")) {
                price = 41;
            } else if (sport.equals("Yoga")) {
                price = 45;
            } else if (sport.equals("Zumba")) {
                price = 34;
            } else if (sport.equals("Dances")) {
                price = 51;
            } else if (sport.equals("Pilates")) {
                price = 39;
            }
        } else if (symbol.equals("f")) {
            if (sport.equals("Gum")) {
                price = 35;
            } else if (sport.equals("Boxing")) {
                price = 37;
            } else if (sport.equals("Yoga")) {
                price = 42;
            } else if (sport.equals("Zumba")) {
                price = 31;
            } else if (sport.equals("Dances")) {
                price = 53;
            } else if (sport.equals("Pilates")) {
                price = 37;
            }


        }
        if (age <= 19) {
            price = price - (price * 0.20);
        }
        if (sum >= price) {
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        }
        double diff = Math.abs(sum - price);
        if (sum < price) {
            System.out.printf("You don't have enough money! You need $%.2f more.",diff);
        }
    }
}
//НЕ Е РЕШЕНА
