import java.util.Scanner;
 
public class MovieDay {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        
        int shootingTime = Integer.parseInt(scanner.nextLine());
        int sceneCount = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());
 
        
        double preparation = shootingTime * 0.15;
 
     
        double totalTime = (sceneCount * sceneDuration) + preparation;
 
        
        if (shootingTime >= totalTime) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(shootingTime - totalTime));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(totalTime - shootingTime));
        }
    }
}