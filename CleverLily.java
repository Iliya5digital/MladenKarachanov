package firstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int onePriceToys = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int toys = 0;
        double allMoney = 0;
        int brotherSum = 0;
        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                money = money + 10;
                allMoney = allMoney + money;
                brotherSum++;

            } else {
                toys++;
            }
        }
            double totalSum = toys * onePriceToys;
            double finish = allMoney + totalSum - brotherSum;
            double diff = Math.abs(finish - price);
            if (finish >= price) {
                System.out.printf("Yes! %.2f", diff);
            } else {
                System.out.printf("No! %.2f", diff);
            }
        }
    }