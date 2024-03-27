import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    //while loop - цикл While

    /*
    while (condition)
    {
    statement (s) // блок кода
    }
     */
    public static void main(String[] args) {
        int j = 1;
        System.out.println(j);

        j++;
        System.out.println(j);

        j++;
        System.out.println(j);

        double i = 0.05;

        while (i <= 10) {
            System.out.print(++i + " ");
            //i++;
        }
        System.out.println("\nAfter while");

        System.out.println("decreasing loop");
        i = 10;

        while (i > 0) {
            System.out.println(i);
            i--;

            i = i - 2;
        }

        /*
        while ( true ) { //бесконечный цикл

            System.out.println( "True!" );

        }
        */
        int n = 6;
        System.out.println("Sum of numbers from 1 to " + n + " = " + countSum(n) + "\n~~~~~~ end of while\n");

        printSquareNumber(n);

        System.out.println(n);

        System.out.println("Print odd and even");
        printEven (n);


        System.out.println("char with while");
        char ch = '1';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println("\n~~~~~~ end of char with while\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter a letter");

        char chStr = scanner.next().charAt(0); //чтение символа char с клавиатуры
        System.out.println("You entered " + chStr + "\n~~~~~~ end of char scanner\n");


    }

    /*
    Используя While написать метод, возвращающий сумму цифр от 1 до 5
     */
    public static int countSum(int n) {
        // 1 + 2 + 3 + 4 + 5 = 15

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    /*
    Написать метод, выводящий на экран квадрат числа от 1 до заданного числа n
     */
    public static void printSquareNumber(int n) {
        //int sqr = 0;
        int i = 1;

        while (i <= n) {
            System.out.println("Number is: " + i + "; square of " + i + " is " + (i * i));
            i++;
        }
        System.out.println("\n~~~~~ end of second while\n");
        //return sum;

    }

    /*
    Написать метод, который печатает, является ли каждое целое число в диапазоне от 2 до n четным или нечетным
     */
    public static void printEven(int n) {
        //int number = 0;
        int i = 2;

        while (i <= n) {
            //System.out.println("Number is: " + i + "; square of " + i + " is " + (i * i));
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
            i++;
        }
    }
}