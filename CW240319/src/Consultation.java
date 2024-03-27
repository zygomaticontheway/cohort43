import java.security.PublicKey;
import java.util.Scanner;

public class Consultation {

    public static void main(String[] args) {

       // String strName = "John";
        //System.out.println(strName.charAt(0)); //взять первую букву со строки

        //charAtExample ();

        //System.out.println("Factorial of n is " + factorial(12));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer Base");
        int base = scanner.nextInt();

        System.out.println("Enter integer Power");
        int power = scanner.nextInt();

        System.out.println(base + " in power " + power + " is " + countPower (base, power));
        System.out.println("~~~~~ end of countPower\n");

        System.out.println("Count banknotes for 56$");
        countBanknotes (56);

    }
    public static void charAtExample (){
        Scanner scanner = new Scanner(System.in);

        char ch;

        do {
            System.out.println("Enter a letter, or q to quit");
            ch = scanner.next().charAt(0);

            System.out.println( "you've entered " + ch);

        }
        while (ch != 'q');

    }

    // 5! = 1*2*3*4*5

    /*
    Написать метод для факториала числа n, используя цикл for
     */
    public static int factorial (int n){

        int fact = 1;

        for (int i = 1; i <=n; i++) {

            fact *= i;

        }
        return fact;
    }

    /*
    Написать метод, кот находит заданное число в заданной степени.
    Запрещено использовать math методы
     */
    public static int countPower (int base, int power) {

        int result = 1;

        for (int i = 1; i <= power; i++) {

            result *= base;
        }

        return result;

    }
    /*
    в банкомате есть банкноты номиналом 1, 5, 10 долларов
    Написать метод, который подсчитывает минимальное количество банкнот, необходимое для выдачи суммы денег n.
    Использовать можно только арифметические действия.

    47 -> 4x10, 5x5, 1x1

     */
    public static void countBanknotes (int n) {
        int oneDollar = 1;
        int fiveDollars = 5;
        int tenDollars = 10;

        int tens = n / tenDollars;
        int fives = n % 10 / fiveDollars;
        int ones = n % 5 / oneDollar;

        System.out.println("10$ = " + tens + "; 5$ = " + fives + "; 1$ = " + ones);

    }
}
