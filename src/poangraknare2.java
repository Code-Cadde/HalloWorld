import java.util.Scanner;

public class poangraknare2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int poang = 0;

            System.out.println("Välkommen till poäng räknaren: ");

            boolean run = true; 

            while (run) {
                System.out.println("Skriv + för att öka poäng och - för att minska poäng");
                System.out.println("Ditt poäng just nu är: " + poang);
                String choice = input.nextLine();

                switch (choice) {
                    case "+":
                    poang++;
                    if (poang > 5) {
                        run = false; 
                    System.out.println("Spelaren är nu slut!");
                    }
                    break;

                    case "-":
                    poang--;
                    if (poang < 0) {
                    run = false; 
                    System.out.println("Spelaren är nu slut!");
                    }
                    break;

                    default: 
                    System.out.println("Nu blev det fel, skriv bara +/-");
                }

            }

            input.close();



            //System.out.println("Ditt nuvarande poäng är: " + poang);
            //System.out.println("Skriv ett tal: ");
            
            //int tillskott = input.nextInt();
            //poang = poang + tillskott; 

            //System.out.println("Ditt poäng är nu: " + poang);
            //System.out.println("Lägg till ett tal: ");
            //int andraTillskottet = input.nextInt();

            //int total;
            //total = andraTillskottet + poang;
            //System.out.println("Ditt tal är nu: " + total);
    }
}
