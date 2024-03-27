import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer n");
        int n = scanner.nextInt();

        triangleWhile (n);


    }
/*
Задача 2
Переписать задачу про треугольник из сегодняшнего занятия используя циклы while
 */
    public static void printTriangle (int n) {
        for (int i =1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void triangleWhile (int n) {
        int i = 1;
        while (i <= n ) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }

}
