public class HWbyTeacher {
    public static void main(String[] args) {
        /*Задача 1
Есть две переменные целого типа. Написать программу, выводящую на экран сумму их значений,
а в том в случае, если эти числа равны, должна выводиться двойная сумма.
Пример: 1 + 2 -> 3
3 + 2 -> 5
2 + 2 -> 8

         */

        int a = 1;
        int b = 3;
        int sum = a+b;

        if (a == b) {
            sum = sum * 2;
        }

            System.out.println(sum);
        /*
        Задача 2
Есть три переменные целого типа. Написать программу, которая сравнивает эти числа
и выводит на экран результат:

All numbers are equal если они равны
All numbers are different если все они все разные
Some numbers are equal если какие-то из них равны
         */
        int x = 2;
        int y = 3;
        int z = 4;

        if (x == y && x == z) {
            System.out.println("All numbers are equal");
        }
        else if (x == y || x == z || z == y) {
            System.out.println("Some numbers are equal");
        }
        else {
            System.out.println("All numbers are different");
        }
    }
}
