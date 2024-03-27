import java.util.Scanner;

public class OurSwitch {
    /*
    Switch
    оператор для замены большого количества if-else
    до Java v 14 был слегка упрощенный, его и рассмотрим. Сейчас стало больше доп. возможностей

     switch (expression) // должна быть переменная, контролирующая switch одного из следующих типов:
        - int - byte - short - char - String
     case constant1:
        statements
        break;

     case constant2:
        statements
        break;

     case constant3:
        statements
        break;
        .
        .
        .
     default //определяет действия в случае, если не одна из констант не соответствует выражению в круглых скобках (как else). Если не указать default, то просто ничего не выполнится
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();

        switch (i) {
            case 45:
                System.out.println("i is 45");
                break;

            case 1:
                System.out.println("i is 1");
                break;

            case 30:
                System.out.println("i is 30");
                break;

            case 5:
                System.out.println("i is 5");
                break;

            default:
                System.out.println("i is another number");
        }

        char ch = 'b';
        switch (ch) {
            case 'b':
                System.out.println("Case b");
               break; // если не поставить break, то будут выполняться действия следующих case'ов, игнорируя условия этих case'ов

            case 'a':
                System.out.println("Case a");
                break;

            case 'y':
                System.out.println("Case y");
                break;

            default:
                System.out.println("Wrong letter");
        }



    }
}
