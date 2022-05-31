import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();
        if( age < 18 && age >= 0 ) {
            System.out.println("Nie możesz kupić alkoholu");

        } else if ( age < 0 ) {
            System.out.println("Wprowadz poprawną wartość");
        } else {
            System.out.println("Dziękujemy za zakupy i zapraszamy ponownie");

        }
    }
}

