import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            int ticketCost;
            ticketCost = 100;

            int movieNightCost = 2000;
            
            System.out.print("Hur många biljetter sålde ni? ");
            int numberOfGuest;
            numberOfGuest = input.nextInt(); 

            int profit = ticketCost * numberOfGuest - movieNightCost; 

            System.out.println("Ni har tjänat " + profit + "KR!");
        }
    }
}
