public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2;

        if(dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik);
        } else {
            System.out.println("Proszę podaj inną liczbę");
        }
    }
}
