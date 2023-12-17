package programmingBasics;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budjet = Integer.parseInt(scanner.nextLine());
        String seson = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        switch (seson) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent=4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (num <= 6) {
            rent = rent * 0.90;
        } else if (num > 7 && num <= 11) {
            rent = rent * 0.85;
        } else if (num > 12) {
            rent = rent * 0.75;
        }
        if (num % 2 == 0 && !seson.equals("Autumn")) {
            rent = rent * 0.95;
        }


        if (budjet >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budjet - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budjet);

        }
    }
}
