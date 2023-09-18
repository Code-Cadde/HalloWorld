import java.util.Scanner;

public class inputOutput {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv in ett nummer? ");
        int nummer = input.nextInt();
        input.nextLine();
        System.out.print("Du skrev: " + nummer + " ");

        System.out.print("Skriv en text: ");
        String text = input.nextLine(); 
        System.out.print("Du skrev: " + text);

        input.close();
    }
}
