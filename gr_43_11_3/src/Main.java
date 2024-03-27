import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int abs1 = Math.abs (-10); //значение по модулю

            System.out.println(abs1);

            int a =1;
            int b = 2;
            int min = Math.min(a, b); //минимум

        boolean bol = false;
        System.out.println(bol);

    //операторы сравнения relational and logical operators
        /*
        == проверка на равенство
        != не равно - проверка на неравенство
        > больше
        < меньше
        >= больше или рано
        <= меньше или рано
        Сравнивать можно только сопоставимые типы переменных
         */
        int i = 10;
        int j = 1;

        boolean res;
        res = i >= j; // присвоит переменной значение результата сравнения

        System.out.println(res);

    // логические операторы
        /*
        & AND (и) умножение
        | OR (или) сложение
        ! NOT (не)
        ^ XOR (исключающее или)

        && conditional при сравнении если первый операнд 0,
            то результат уже понятен и второй операнд не рассматривается. Ответ будет 0

        || conditional при сравнении если первый операнд 1,
            то результат уже понятен и второй операнд не рассматривается. Ответ будет 1
         */
        boolean p = true;
        boolean q = true;
        System.out.println(p^q);

        /*
        ^ XOR Если значения p и q одинаковые, то результат false. Если разные, то true
        | p         | q         | p^q
        | false     | false     | false
        | true      | false     | true
        | false     | true      | true
        | true      | true      | false
         */

        if (p & q){ //в результате должно быть логическое выражение
            System.out.println("true");
        }
        // Делится ли n1 на d1 нацело (без остатка)?
            int n1, d1;

            n1 = 10;
            d1 = 3;
            System.out.println("n1 на d1 делится нацело - " + (n1 % d1 == 0));
            //System.out.print(n1 % d1 == 0); //при делении без остатка, то будет true, иначе false
            if (d1 != 0 && (n1 % d1) == 0){
                System.out.println("can be divided without remainder");
            }
            else {
                System.out.println("remainder is " + (n1 % d1));
            }

    }
}
