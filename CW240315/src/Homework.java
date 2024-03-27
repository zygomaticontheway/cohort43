public class Homework {
    public static void main(String[] args) {

        double fahrenheit = 451;
        double res = convertToCelsius1 (fahrenheit);
        System.out.println(fahrenheit + "F -> " + Math.round( convertToCelsius1(fahrenheit) ) + "C");

        double inch = 451;
        System.out.println(inch + "\" is " + inchToMeter (inch) + "m");

    }
    /*
        Задача 2*
Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия по формуле С = 5*(F-32)/9. Значение градусов Фаренгейта должно передаваться как аргумент метода.
Метод должен возвращать полученное значение в основную программу.
Затем, в методе main вывести полученное значение на экран.
         */
    public static double convertToCelsius (double fahrenheit) {
        double celsius = 5 * (fahrenheit - 32.0)/9.0;

        return celsius;
    }

    //аналогичное решение, но короче
    public static double convertToCelsius1 (double fahrenheit) {
        return 5 * (fahrenheit - 32.0)/9.0;

    }

    //Написать метод для перевода дюймов в метры. Один дюйм это 0.025 метра

    public static double inchToMeter (double inch) {
        double meter = 0.0254 * inch;

        return meter;
    }
}
