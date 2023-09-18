import java.util.Random;
import java.util.Scanner;

public class tarningskastaren {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hur många sidor har din tärning? Välj mellan 4, 6, 8, 16, 20: ");
        int sidor = input.nextInt();

        System.out.println("Hur många tärningar ska du kasta: ");
        int antal = input.nextInt();  

        for  (int i = 0; i < antal; i++) {
            Random slump = new Random();
            int kastResultat = slump.nextInt(sidor) + 1;


            System.out.println(kastResultat);

        }
        input.close();
    }
}
