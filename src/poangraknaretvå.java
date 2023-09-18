import java.util.Scanner;

public class poangraknaretvå {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int poang = 0; 

        System.out.println("Välj ett tal att öka ditt poäng med: ");
        int tillskott = input.nextInt(); 

        poang = poang + tillskott;
        System.out.println("Ditt poäng är nu: " + poang);
        System.out.println("Skriv nu in ett tal yttligare att lägga till med: ");
        int tillskottAndra = input.nextInt();

        int total = poang + tillskottAndra;
        System.out.println("Din poängställning är nu: " + total);

        input.close();

    }

    
}
