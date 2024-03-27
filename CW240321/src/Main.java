public class Main {
     /*
    for-each loop цикл сокращённой записи цикла

    for ( type variable : array ) {
    statement/s
    }
     */
     public static void main(String[] args) {

         int [] numbers = {10, 20, 30, 40, 50};

         System.out.println("** Print with for-each:");

         for (int element : numbers) {
             System.out.print(element + " ");
         }
         System.out.println("\n~~~~~\n");

         sumNumbers1 (numbers);

         sumNumbers2 (numbers);

         changeElementWithForEach (numbers);

         System.out.println("Array1 is equal array2 is");

         int [] array1 = {1,2,3};
         int [] array2 = {1,2,3};
         int [] array3 = {1,2,3,4};
         int [] array4 = {2,2,3};

         System.out.println("Array1 is equal array2: " + areEqual(array1, array2));

         System.out.println("print even elements:");
         for (int i = 0; i < array1.length; i++){
             if (i % 2 == 0) {
                 System.out.println(array1[i]);
             }
         }

     }

     public static void sumNumbers1 (int [] numbers){
         int sum = 0;
         for (int i =0; i < numbers.length; i++){
             sum = sum + numbers [i];
         }
         System.out.println("Sum with FOR is " + sum);
         System.out.println("~~~~~\n");
     }

    public static void sumNumbers2 (int [] numbers){
        int sum = 0;
        for (int elt : numbers){
            sum = sum + elt;
        }
        System.out.println("Sum with FOR-EACH is " + sum);
        System.out.println("~~~~~\n");
    }

    public static void changeElementWithForEach (int [] numbers){
        System.out.println(" An attempt to change element with for-each");

        for( int element : numbers) {
            System.out.print(element + " ");
            element *= 100;// замена элементов при такой записи с for-each не работает
        }
        System.out.println("\nAfter change:");
        for( int element : numbers) {
            System.out.print(element + " ");
        }
    }
    /*
    Есть 2 массива целых чисел.
    написать метод, проверяющий их равенство. В случае если массивы равны, метод возвр. true, если нет, то false.

    Массивы равны, если они одинковы.
    {1,2,3} = {1,2,3}

     */

    public static boolean areEqual (int [] array1, int [] array2){
        //System.out.println("Array1 is equal array2 is");
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1 [i] != array2[i]) {
                 return false;
            }
            else {
                return true;
            }
        }
        return true;
    }
}
