public class Ternary {

    //Тернарный оператор

    public static void main(String[] args) {

        int age = 15;

        if (age >= 18) {
            System.out.println("Can vote");
        }
        else {
            System.out.println("Can not vote");

        }

        boolean isAdult = age >= 18? true: false; // вместо if-else - тернарный оператор
        System.out.println(isAdult);

        String isAdultStr = age >= 18 ? "Can vote" : "Can't vote"; // в качестве вариантов может быть вложенное условие или вызов метода
        System.out.println(isAdultStr);

        // проверка на четность
        int number = 11;
        String isEven = number % 2 == 0 ? "Even number" : "Odd number";
        System.out.println(number + " is " + isEven);

        //еще пример использования
        int num = 10;
        int num1 = 0;
        int abs = num >= 0 ? num : -num; // взять число по модулю
        int min = num <= num1 ? num : num1; // взять минимальное из двух



    }
}
