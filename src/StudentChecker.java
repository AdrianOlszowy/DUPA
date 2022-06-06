public class StudentChecker {

    public static void main(String[] args) {

        Student adam = new Student();
        adam.imię = "Adam";
        adam.nazwisko = "Adamski";
        adam.numerIndeksu = 234234;
        adam.email = "adam.adamski@gmil.com";
        adam.nick = "Adamek";


        Student kasia = new Student();
        kasia.imię = "Kasia";
        kasia.nazwisko = "Jasinska";
        kasia.numerIndeksu = 235235;
        kasia.email = "kasia.jasinska@gmil.com";
        kasia.nick = "Kate";


        Student piotrek = new Student();
        piotrek.imię = "Piotrek";
        piotrek.nazwisko = "Kowalski";
        piotrek.numerIndeksu = 230230;
        piotrek.email = "piter.kowalski@gmil.com";
        piotrek.nick = "Kowal";

        Student[] students = new Student[3];
        students[0] = adam;
        students[1] = kasia;
        students[2] =  piotrek;


        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();

        }

    }
}
