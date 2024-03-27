import java.util.Scanner;

public class GuessNumber {
    static Scanner scanner = new Scanner (System.in);

    static int secretNumber = 5;

    public static void main(String[] args) {
        /*
        Игра Угадай число
        Игрок должен угадать задуманное программой число, введя его с клавиатуры
         */
        Scanner scanner = new Scanner(System.in);
        //int secretNumber = readSecretNumber();

        start();
        //int attempts = readNumberOfAttempts();


        //guessNumber (attempts);

    }

    public static void guessNumber (int attempts){
        while (attempts > 0) {

            System.out.println("Guess number between 0 and 9");
            int answer = scanner.nextInt();

            if (answer == secretNumber) {
                System.out.println("You're right, that's " + answer + "\n");
                break;
            } else {
                System.out.print("Sorry, the number is ");
                if (answer <= secretNumber)
                    System.out.println("too small\n");
                else System.out.println("too big\n");

                //System.out.println("You're wrong");
            }
            attempts--;
        }
        System.out.println("Game over. You have no more attempts");

    }
    public static int readNumberOfAttempts () {
        System.out.println("Enter the amount of attempts:");
        //int input = scanner.nextInt();

        return scanner.nextInt();
    }

    public static int readSecretNumber () {
        System.out.println("Guess the secret number between 0 and 9:");
        //int input = scanner.nextInt();

        return scanner.nextInt();
    }
    public static void start () {
        int attempts = readNumberOfAttempts();
        guessNumber(attempts);
        scanner.close();
    }
}
