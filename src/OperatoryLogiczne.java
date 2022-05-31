public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;


        // && -> true wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstValue && fourthValue);
        System.out.println(secondValue && thirdValue);

        // || lub -> true gdy jedno z wyrażenie składowe jest równe true

        System.out.println(firstValue || secondValue);
        System.out.println(firstValue || fourthValue);
        System.out.println(secondValue || thirdValue);


        // ! negacja  - zwraca wartość przeciwną do wyrażena przed którym się znajduje

        System.out.println(!firstValue); // false
        System.out.println(!thirdValue); // true
        System.out.println(!firstValue && secondValue); // true

    }
}
