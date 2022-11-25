import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Velkommen til lommeregnen");

        //erklære vores attributter
        int nummer1;
        int nummer2;
        char regneoperator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast dit første nummmer");
        nummer1 = scanner.nextInt();

        System.out.println("Intast dit andet nummer");
        nummer2 = scanner.nextInt();

        System.out.println("Indtast dit regneoperation");
        regneoperator = scanner.next().charAt(0);

        if(regneoperator == '+'){
            System.out.println("=  " + (nummer1 + nummer2));
        }
        if(regneoperator == '-'){
            System.out.println("=  " + (nummer1 - nummer2));
        }
        if(regneoperator == '*'){
            System.out.println("=  " + (nummer1 * nummer2));
        }
        if(regneoperator == '/'){
            System.out.println("=  " + (nummer1 / nummer2));
        }
        

















    }
}
