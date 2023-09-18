import java.util.Scanner;

public class gissatalet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int svar = (int) (Math.random() * 100) + 1; 

        boolean run = true; 

        int guesses = 0;

        System.out.println("Vi ska köra ett gissningspel");

        while (run) {
            System.out.println("Gissa vilket numret 1-100: ");
            int gissning = input.nextInt();


            if  (gissning == svar) {
                System.out.println("Du har gissat rätt!");
                run = false;
                guesses++;
                System.out.println("Du har gissat: " + guesses);
            }
            if (gissning > svar) {
                System.out.println("Du har gissat för högt, försök igen");
                guesses++;
                System.out.println("Du har gissat: " + guesses);
                
            }
            if (gissning < svar) {
                System.out.println("Du har gissat för lågt, försök igen");
                guesses++;
                System.out.println("Du har gissat: " + guesses);
            
            }
        }


        input.close();
    }
}
