import java.util.Scanner;

public class raknamedjava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in ett tal: ");
        int forstaTalet = input.nextInt();

        System.out.println("Skriv in ett tal till: ");
        int andraTalet = input.nextInt();

        System.out.println("Välj sedan ett räkne sätt. Du får välja mellan +, -, /, och * ");
        String raknesatt = input.next();

        int total = 0;

        switch (raknesatt) {
            case "+":
            total = forstaTalet + andraTalet;
            System.out.println("Ditt tal blir " + total);
            break;

            case "-":
            total = forstaTalet - andraTalet; 
            System.out.println("Ditt tal blir " + total);
            break;

            case "/":
            total = forstaTalet / andraTalet;
            System.out.println("Ditt tal blir " + total);
            break;

            case "*": 
            total = forstaTalet * andraTalet;
            System.out.println("Ditt tal blir " + total);
            break;

            default:
            System.out.println("Skriv endast in +,-,/ eller *");
            break;
        }





        input.close();
    }
}
