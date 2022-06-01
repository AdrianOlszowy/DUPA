public class LoopsCheck {
    //1.Wypisz liczby z zakresu 1-100 podzielne przez 3
    //2.Zadanko z odwróceniem elementów tablicy [1,3,5,7,0] --> [0,7,5,3,1]

    //1
   //  public static void main(String[] args) {

      //  for (int i=1; i<100;i++) {

          //  if(i%3==0)
               // System.out.println("Podana liczba z tego zbioru jest podzielna przez 3 i wynosi: " + i);

    //2
    public static void main(String[] args) {
        int[] numbers = new int[] {1,3,5,7,0}; {

        }

        for (int i=0; i<(numbers.length/2); i++){
            int temp = numbers[i]; // dla i=0  1   i=1  3
            numbers[i] = numbers[numbers.length-1-i]; // 4 -> 0    3 = > 7
            numbers[numbers.length-1-i] = temp; //1 // number[3]=3

        }
        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }


}
