public class Main {

    // цикл For

    /*
    for (initialisation; condition; incr/decr counter) {}

    initialisation - объявление и присвоение начального значения переменной (счетчику)
                        выполняется один раз в начале цикла

    condition - условие, определяющее, будет ли выполняться цикл. Цикл выполняется пока условие = true

    incr/decr - определяет изменение переменной-счетчика
     */

    public static void main(String[] args) {
        System.out.println("For + ");
        for (int i = 0; i <= 10; i++) { //переменную счетчика часто на практике называют именно i
            System.out.println(i);
        }

        System.out.println("For - ");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; ) {
            System.out.println(i);
            i++;
        }

        System.out.println("parts of For");
        int i = 0;

        for (; i < 5;){
            System.out.println(i);
            i++;
        }
        System.out.println("Two variables");

        for (int i1 =1, j1 = 10; i1 <= j1; i1++, j1--){
            System.out.println("i1 = " + i1 + " | j1 = " + j1);
        }

        //for ( ; ; ){} //бесконечный цикл

        System.out.println("Sum is " + sum (5));

        sum1(5);

    }
    public static int sum (int n){

        int sum = 0;

        for(int i = 1; i <= n; i++){

            sum += i; // аналог sum = sum + i;
        }

        return sum;
    }

    //For without body
    public static void sum1 (int n){

        int sum = 0;

        for (int j = 1; j <= 5; sum += j++); // sum сначала прибавляет j, затем инкриминирует j (postfix)
        System.out.println("Sum without body is " + sum);

    }
}
