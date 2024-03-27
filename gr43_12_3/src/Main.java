public class Main {
    public static void main(String[] args) {
/*
Написать логическое выражение для проверки високосного года.
Простое решение, 3 условия:
    1) год делится на 4 без остатка
    2) год делится на 100 без остатка
    3) год делится на 100 без остатка и делится на 400 без остатка
 */
    int year = 2004;

    boolean a1 = (year % 4) == 0;

    boolean b1 = (year % 100) != 0;

    boolean c1 = (year % 100 ==0) && (year % 400 == 0);

    boolean isLeapYear;

        isLeapYear = a1 && (b1 || c1);
    //    System.out.println("Is " + year + " a leap year? " + isLeapYear);

    //Приоритет операций

    /*
        [Highest]

    ++ (postfix) -- (postfix)
    ++ (prefix) -- (prefix) !
    *  /  %
    +  -
    >  >=  <  <=
    == !=
    &
    ^
    |
    &&
    ||
    =
        [Lowest]
     */

    // Преобразование типов данных Casting
        double x1, y1;
        x1 = 18.0;
        y1 = 5.0;
        System.out.println(x1 + "/" + y1 + "=" + (int) (x1/y1) + '\n');

        byte b2;
        int i1;
        char ch;

        i1 = (int) (x1/y1); //casting double to int

        i1 = 350;
        b2 = (byte) i1; // при i1 > 127 идет потеря данных, т.к. тип int занимает 4 byte, а byte занимает 1 byte
        System.out.println("b2 = " + b2 + '\n');

        b2 = 88; //ASCII for x
        ch = (char) b2;
        System.out.println("ch = " + ch);

    //VAR
        double j = 1000.0; // идентично "var jVariable = 1000.0;"
        var jVariable = 1000.0; //как только тип определен (тут из правой части), то измениться тип у этой переменной больше не может



    }
}
