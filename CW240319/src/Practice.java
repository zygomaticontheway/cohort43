import java.util.Scanner;

public class Practice {
    /*
    Вывести на экран треугольник, состоящий из цифр от 1 до числа n.
    1
    12
    123
    1234
    ...
    1234 ... n
     */
    public static void main(String[] args) {
        triangle(5);

    }

    public static void triangle (int n) {
        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= i; j++) { //также работает условие j != i
                System.out.print(j); //треугольник состоит из увеличенного на единицу i
                //System.out.print(i); // треугольник состоит из только i
            }
            System.out.println();
        }
    }
}
