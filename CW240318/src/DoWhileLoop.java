import java.util.Scanner;

public class DoWhileLoop {

    /*
    do-while //делай ..., пока ...

    do {
        statements
        }
        while (conditions)

    // отличие этого цикла от while, что d0-while выполняется хотя бы один раз

     */
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println(i);
            System.out.println("~~~~~~ end of first do");

            i--;
        }
        while (i > 1);

        example ();

    }

    public static void example () {
        System.out.println("Enter any letter, you want to see on a screen");

        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.println("* Enter the letter, or 'q' to quit");
            ch = scanner.next().charAt(0);

            System.out.println("** You've typed " + ch + "\n");
        }
        while (ch != 'q');

        System.out.println("The program is over. Good bye");

    }
}
