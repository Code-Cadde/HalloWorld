import java.util.Scanner;

public class poangRaknare {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            int poang = 0;
            System.out.println("Ditt nuvarande poäng är: " + poang);
            System.out.println("Skriv ett tal: ");
            int tillskott = input.nextInt();
            poang = poang + tillskott; 
            System.out.println("Ditt poäng är nu: " + poang);
            System.out.println("Lägg till ett tal: ");
            int andraTillskottet = input.nextInt();
            int total;
            total = andraTillskottet + poang;
            System.out.println("Ditt tal är nu: " + total);
             
        }
    }
}