import java.util.Scanner;

public class raknamedjava20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Vilket räknesätt vill du använda: +, -, / eller *? ");
            String raknesatt = input.nextLine();
            if (raknesatt.equals("end")) {
                run = false; 
                System.out.println("Nu stängs programmet!");
                break;
            }

            System.out.println("Ge mig första talet: ");
            int talEtt = input.nextInt();

            System.out.println("ge mig andra talet ");
            int taltva = input.nextInt();  

            
            int total;

            switch (raknesatt) {
                case "+":
                total = talEtt + taltva; 
                System.out.println("Ditt tal är " + total);
                break;

                case "-":
                total = talEtt - taltva;
                System.out.println("Ditt tal är " + total);
                break;

                case "/":
                total = talEtt / taltva;
                System.out.println("Ditt tal är " + total);
                break;

                case "*":
                total = talEtt * taltva;
                System.out.println("Ditt tal är " + total);
                break;

                default:
                System.out.println("Nu blev det fel, använd endast +,-,/,*");
                
            }
            input.nextLine();
        }



        input.close();
        
    }
}
