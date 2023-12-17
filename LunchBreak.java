package firstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String nameFilm=scanner.nextLine();
        int episode=Integer.parseInt(scanner.nextLine());
        int durationRest=Integer.parseInt(scanner.nextLine());
        double time=0;
        double lunch=durationRest*0.125;
        double rest=durationRest*0.25;
        time=durationRest-lunch-rest;

        double diff=Math.abs(episode-time);
        if (time>=episode){

            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",nameFilm,diff);

        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameFilm,diff);
        }
    }
}
