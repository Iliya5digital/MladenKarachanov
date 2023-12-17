package firstStepsInCoding.MoreExercises;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holiday = Double.parseDouble(scanner.nextLine());
        int numPuzzles = Integer.parseInt(scanner.nextLine());
        int numDolls = Integer.parseInt(scanner.nextLine());
        int numTeddyBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numTrucks = Integer.parseInt(scanner.nextLine());
        //	Пъзел - 2.60 лв.
        //	Говореща кукла - 3 лв.
        //	Плюшено мече - 4.10 лв.
        //	Миньон - 8.20 лв.
        //	Камионче - 2 лв.
        double onePuzzle = 2.60;
        double oneDolls = 3.0;
        double oneTeddyBears = 4.10;
        double oneMinions = 8.20;
        double oneTrucks = 2.00;
        double sum = numPuzzles * onePuzzle + numDolls * oneDolls
                + numTeddyBears * oneTeddyBears
                + numMinions * oneMinions + numTrucks * oneTrucks;
        double numToys = numPuzzles + numDolls + numTeddyBears
                + numMinions + numTrucks;
        double discount = 0;
        double rent = 0;
        if (numToys >= 50) {
            discount = sum * 25 / 100;
        }
        double result = sum - discount;
        double finish = result * 0.1;
        double totalFinish = result - finish;
        double diff = Math.abs(totalFinish - holiday);
        if (totalFinish >=holiday) {
            System.out.printf("Yes! %.2f lv left.", diff);

        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
