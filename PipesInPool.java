package ProgrammingBasics2;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double fillingWithWater = p1 * h;
        double fillingWithWater2 = p2 * h;
        double all = fillingWithWater + fillingWithWater2;
        double contributed = (all / v) * 100;
        double contributed2 = ((fillingWithWater / all) * 100);
        double contributed3 = ((fillingWithWater2 / all) * 100);

        if (all > v) {
            //     double overflow =Math.abs(all-v);
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, Math.abs(all - v));
        } else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", contributed, contributed2, contributed3);
        }
    }
}