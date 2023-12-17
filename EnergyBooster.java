package ProgrammingBasics2;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String sizeSet = scanner.nextLine();
        int numSet = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;
        if (fruit.equals("Watermelon")) {
            if (sizeSet.equals("small")) {
                price = numSet * 56 * 2;

            } else if (sizeSet.equals("big")) {
                price = numSet * 28.70 * 5;
            }

        } else if (fruit.equals("Mango")) {
            if (sizeSet.equals("small")) {
                price = numSet * 36.66 * 2;
            } else if (sizeSet.equals("big")) {
                price = numSet * 19.60 * 5;
            }
        } else if (fruit.equals("Pineapple")) {
            if (sizeSet.equals("small")) {
                price = numSet * 42.10 * 2;
            } else if (sizeSet.equals("big")) {
                price = numSet * 24.80 * 5;
            }
        } else if (fruit.equals("Raspberry")) {
            if (sizeSet.equals("small")) {
                price = numSet * 20 * 2;
            } else if (sizeSet.equals("big")) {
                price = numSet * 15.20 * 5;
            }

        }
        if (numSet >= 400 && numSet <= 1000) {
            price = price - (price*0.15);

        }
        if (numSet > 1000) {
            price = price - (price*0.50);

        }

        System.out.printf("%.2f lv.", price);
    }
}

//НЕ Е РЕШЕНА