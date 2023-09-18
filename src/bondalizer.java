import java.util.Scanner;

public class bondalizer {
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Vad är ditt förnamn? ");
            String förNamn = input.nextLine();


            System.out.print("Vad är ditt efternamn? ");
            String efterNamn = input.nextLine();

            System.out.print("Your name is " + efterNamn + ", " + bondalize(förNamn, efterNamn));
        }

    }

    public static String bondalize(String förNamnString, String efterNamnString) {
        String bondnamn = förNamnString + " " + efterNamnString;
        return bondnamn;

    }
    }


