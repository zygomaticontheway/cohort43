import java.util.Scanner;

public class Main {

    // Методы в Java

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("Hello Java");

        ;

        printHello(); //вызов метода

 */
        //hello();
        /*
        System.out.println("enter integer number a ");
        int x = scanner.nextInt();

        System.out.println("enter integer number b ");
        int y = scanner.nextInt();

        sum ( x, y ); //вызов метода с параметрами

         */
/*
        System.out.println("Enter the name");
        String inputName = scanner.nextLine();

        System.out.println("Enter the age");
        int inputAge = scanner.nextInt();

        displayName ("Baggins", inputName, inputAge);

        displayName ("Laggins", "Billy", 15);

 */
 /*
        int res = sum (1, 2,3); //записываем значение метода sum в переменную res
        System.out.println(res + 100);

 */

        System.out.println("Input current hour");
        int currentTime = scanner.nextInt();
        System.out.println(time(currentTime));

        System.out.println(square(5));

    }

    public static void printHello () {
        System.out.println("Hello \"printHello\" method!");
        System.out.println("-------end of printHello method-----\n");
        return; //если void (пустота), то return (выход из метода) не нужен
        //hi();

    }

    public static void hi () {
        System.out.println("Hello method \"hi\"");
        System.out.println("-------end of hi method-----\n");
    }

    public static void sum (int a, int b){
        //int a = 1;
        //int b = 2;
        //a = 1; // если инициализировать их внутри метода, то снаружи инициализация работать не будет
        //b = 2;
        System.out.print("a" + " + " + "b" + " = ");
        System.out.println(a + b);
    }

    public static void displayName (String surname, String name, int age) {
        System.out.println("Name is " + name);
        System.out.println("Surname is " + surname);
        System.out.println("Age is " + age);
        System.out.println("----over----\n");
    }

    public static int sum (int a, int b, int c){
        //System.out.println(a + b + c);
        int result = a + b + c;
        //return "Sum is " + result; //возвращаемое значение, если в методе не void, то return обязательно
        return result; //возвращаемое значение, если в методе не void, то return обязательно
    }

    public static String time (int hour) {
        if (hour > 24){
            return "Invalid input";
        }
        else if (hour >= 18 && hour < 22) {
            return "Good evening!";
        }
        else if (hour >= 6 && hour < 12) {
            return "Good morning!";
        }
        else if (hour >= 12 && hour < 18) {
            return "Good afternoon!";
        }
        else {
            return "Good night!";
        }
    }

    //метод, печатающий значение переменной в квадрате
    public static int square (int n){
        int result = n*n;
        //System.out.println(result);
        return result;
    }


}
