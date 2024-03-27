package scanner_class;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        //чтение с клавиатуры с помощью сканера

        Scanner ourScanner = new Scanner(System.in);

        //ourScanner.nextLine(); //команда введения строки с клавиатуры
        System.out.println("Enter your name");
        String name = ourScanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter your surname");
        String surname = ourScanner.nextLine();
        System.out.println("Your name is " + surname);

        System.out.println("Enter your age");
        int age = ourScanner.nextInt();
        System.out.println("Your age is " + age + '\n' + "=======================");

        System.out.println("Your name is " + name + '\n' + "Your surname is " + surname + '\n' + "Your age is " + age);

    }
}
