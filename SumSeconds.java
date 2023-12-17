package programmingBasics;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int firstTime=Integer.parseInt(scanner.nextLine());
        int secondTime=Integer.parseInt(scanner.nextLine());
        int treeTime=Integer.parseInt(scanner.nextLine());
        int totaltime=firstTime+secondTime+treeTime;
        int minutes=totaltime/60;
        int second=totaltime % 60;
        if (second<10) {
            System.out.printf("%d:0%d %n", minutes, second);
        }else{
            System.out.printf(" %d:%d",minutes,second);
        }
    }
}
