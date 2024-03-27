public class Main {
    public static void main(String[] args) {
        /*
        Задача 1
    Пусть есть две переменные целого типа a и b.
    Используя логические операторы написать выражение, результат которого будет true
    если значение хотя бы одной из этих переменных равно 10 или их сумма равна 10.
         */
        //Решение 1
        int a, b;
        a = 5;
        b = 5;

        if (a == 10 || b == 10 || a + b == 10) {
            System.out.println("At least one of variables is 10, or sum is 10");
        } else {
            System.out.println("There is no variables or sum equals 10");

        }

        //Решение 2
        int a1, b1;
        a1 = 6;
        b1 = 5;

        Boolean result;

        result = (a1 == 10 || b1 == 10 || a1 + b1 == 10);
            System.out.println("One of variables is 10, or sum is 10 is " + result);
    }
}
