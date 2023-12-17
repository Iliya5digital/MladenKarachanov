package firstStepsInCoding.MoreExercises;



import java.util.Scanner;

        public class Time15Minutes {
            public static void main(String[] args) {
                Scanner scanner= new Scanner(System.in);
                int hours=Integer.parseInt(scanner.nextLine());
                int minutes=Integer.parseInt(scanner.nextLine());
                int totaltime=hours*60+minutes+15;
                hours=totaltime/60;
                minutes=totaltime%60;
                if (hours>23){
                    hours=0;}

                System.out.printf("%d:%02d",hours,minutes);


            }
        }



