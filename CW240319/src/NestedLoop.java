public class NestedLoop {

    // Nested loop - вложенный цикл

    public static void main(String[] args) {

        // внешний цикл
        for (int i = 0; i <=5; i++){

            // внутренний цикл
            for (int j = 0; j <= 5; j++){
                System.out.println("i = " + i + " , j = " + j);
            }
            System.out.println("~~~~~ end of Nested loop]n");
        }

        printMultiplicationTable();

    }

    public static void printMultiplicationTable (){

        System.out.println("** Multiplication table **");

        int i = 1;

        while (i < 10){
            int j = 1;
            while (j < 10){
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            System.out.println("~~~~~~~~~");
            i++;
        }
        System.out.println("~~~~~ end of Multiplication table\n");

    }
}
