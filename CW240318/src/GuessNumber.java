import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*
        Игра Угадай число
        Игрок должен угадать задуманное программой число, введя его с клавиатуры
         */
        guessNumber();
    }

    public static void guessNumber () {

        Scanner scanner = new Scanner(System.in);

        int secretNumber = 5;
        int startAttempts = 3;
        int attempts = startAttempts;
        int counter = 0;

        while (attempts >0 ){
            System.out.println("Attempt " + ++counter + " of " + startAttempts);
            System.out.println("\n * Guess number between 0 and 9");

            int answer = scanner.nextInt();

            if (answer == secretNumber) {
                System.out.println("You're right, that's " + answer);
                return; //заканчиваем выполнение программы при угадывании
            }
            else {
                System.out.print("Sorry, the number is ");
                if (answer <= secretNumber)
                    System.out.println("too small\n");
                else System.out.println("too big\n");

                //System.out.println("You're wrong");
            }
            --attempts;

            System.out.println("You have " + attempts + " attempts left");

        }

        System.out.println("\n~~~~~~~\n Game over. You don't have attempts");
    }
}
