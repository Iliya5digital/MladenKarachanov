package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hours >= 10 && hours <= 18) {
            if (!day.equals("Sunday")) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {


            System.out.println("closed");
        }
    }
}