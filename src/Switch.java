public class Switch {

    public static void main(String[] args) {

        String danie = "Łosoś";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22 zł");
                break;
            case "Łosoś":
                System.out.println("Cena to 23 zł");
                break;
            case "Frytki":
                System.out.println("Cena 9 zł");
                break;
            default:
                System.out.println("Brak dania w karcie");


        }
    }
}
