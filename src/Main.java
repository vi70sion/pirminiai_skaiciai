import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Parašykite programą kuri prašo įvesti intervalą NUO/IKI ir jame atspausdina
        // pirminius skaičius ir skaičius kurie dalinasi iš 11 be liekanos

        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite intervalą nuo, iki:");
        int intervalasNuo = scanner.nextInt();
        int intervalasIki = scanner.nextInt();
        System.out.println("Pirminiai ir pirminiai, kurie dalinasi iš 11 skaičiai: ");
        for (int i = intervalasNuo; i < intervalasIki; i++){
            if(arPirminis(i)){
                if(i % 11 == 0) System.out.println(i + " pirminis, dalinasi iš 11");
                else System.out.println(i + " pirminis");
            }
        }
        System.out.println();

//        2. Užduotis: Sukurkite programą, kuri naudoja while ciklą, norint suskaičiuoti ir išvesti
//        įvesto skaičiaus skaitmenų sumą. Programa turi paprašyti vartotojo įvesti skaičių ir tada
//        apskaičiuoti bei išvesti skaitmenų sumą. Pvz., jei vartotojas įveda 123, programa turėtų išvesti 6 (1+2+3)

        System.out.println("Įveskite skaičių: ");
        int skaicius = scanner.nextInt();
        System.out.print("Skaičiaus " + skaicius + " skaitmenų suma yra: " + skaitmenuSuma(skaicius) + "(");
        skaitmenys(skaicius);
        System.out.println(")");
        System.out.println();
        scanner.close();
    }

    public static boolean arPirminis(int skaicius) {
        if (skaicius <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(skaicius); i++) {
            if (skaicius % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int skaitmenuSuma(int skaicius) {
        int suma = 0;
        while (skaicius != 0) {
            suma += skaicius % 10; // pridėti paskutinį skaitmenį
            skaicius /= 10; // pašalinti paskutinį skaitmenį
        }
        return suma;
    }
    public static void skaitmenys(int skaicius) {
        while (skaicius != 0) {
            System.out.print(skaicius % 10);
            skaicius /= 10; // pašalinti paskutinį skaitmenį
            if (skaicius != 0) System.out.print(" + ");
        }
        return;
    }
}