import java.util.Scanner;
 
public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String championshipStage = scanner.nextLine();
        String typeOfTicket = scanner.nextLine();
        int numTickets = Integer.parseInt(scanner.nextLine());
        String photoWithTheTrophy = scanner.nextLine();
        double price = 0;
 
        if (championshipStage.equals("Quarter final")) {
            if (typeOfTicket.equals("Standard")) {
                price = 55.50 * numTickets;
 
            }
 
            if (typeOfTicket.equals("Premium")) {
                price = 105.20 * numTickets;
 
            }
 
            if (typeOfTicket.equals("VIP")) {
                price = 118.90 * numTickets;
 
            }
        }
         else if (championshipStage.equals("Semi final")) {
            if (typeOfTicket.equals("Standard")) {
                price = 75.88 * numTickets;
            }
 
            if (typeOfTicket.equals("Premium")) {
                price = 125.22 * numTickets;
 
            }
            if (typeOfTicket.equals("VIP")) {
                price = 300.40 * numTickets;
 
            }
        }
        else if (championshipStage.equals("Final")) {
            if (typeOfTicket.equals("Standard")) {
                price = 110.10 * numTickets;
            }
 
            if (typeOfTicket.equals("Premium")) {
                price = 160.66 * numTickets;
 
            }
            if (typeOfTicket.equals("VIP")) {
                price = 400 * numTickets;
            }
        }
 
 
 
        if (price > 4000) {
            photoWithTheTrophy = "N";
            price *= 0.75;
 
        } else if (price > 2500) {
            price *= 0.90;
        }
        if (photoWithTheTrophy.equals("Y") && price < 4000){
            price += 40.00 * numTickets;
 
        }
        System.out.printf("%.2f\n", price);
    }
}