import java.util.Arrays;

public class SearchAndSort {

    public static void main(String[] args) {

        int [] array = {4,5,0,12,14};
        //int n = scanner.;
        System.out.println("Index of  12 is: " + lineSearch (array, 12));
        System.out.println("Index of  4 is: " + lineSearch (array, 4));

        int [] unsortedArray = {12, 45, 0, 2, 32, 99, 6, 34, -3, 23, 23, 45};
        bubbleSort (unsortedArray);

        //вывод массива на экран без цикла, с помощью класса Arrays
        System.out.println("Array to string");
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("~~~~~\n");

        System.out.println("* sort with Arrays.sort");
        System.out.println("Array before sorting: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
        System.out.println("~~~~~\n");

    }
    /*
        Пусть есть массив целых чисел, нужно написать метод, находящий и возвращающий индекс заданного элемента (первое вхождение).
        Если такого элемента нет, то метод должен вернуть -1.
         */
    public static int lineSearch (int [] array, int n) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        for (int index = 0; index < array.length; index++) {
            if (array [index] == n){
                return index;
            }
        }
        return -1;
    }
    /*
    Сортировка пузырьком Bubble sort.
    //считается неэффективным, используется для учебных целей
    Алгоритм проходит по массиву и сравнивает каждую пару соседних элементов.
    Когда встречается пара, расположенная не по порядку, алгоритм меняет эти 2 элемента местами.

    массив:
    6 3 0 5

    1 проход:
    6 3 0 5 -> 3 6 0 5 -> 3 0 6 5 - 3 0 5 6

    2 проход:
    3 0 5 6 -> 0 3 5 6

    2 проход:
    0 3 5 6 -> 0 3 5 6

    Для перестановки:
    a = 1
    b = 2
        вводим еще одну переменную "temp"
    temp = a
    a = b;
    b = temp = 1;

    Для контроля отсортированности массива, создаем переменную boolean
    boolean sorted = false;

     */
    public static void bubbleSort (int [] array) {

        boolean sorted = false;
        int temp;

        System.out.println("\nUnsorted array is:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        while (!sorted) { //если список еще не отсортирован, то sorted = false

            sorted = true; //предполагаем что он отсортирован

            for (int i = 0; i < array.length - 1; i++) { //перебираем до предпоследнего элемента ибо он будет сравниваться со следующим

                if (array[i] > array[i + 1]) { //проверка необходимости перестановки соседних элементов

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    sorted = false; //раз цикл выполнился, значит перестановка прошла sorted = false и потребуется еще проверка, начнется while
                }

            }
        }
        System.out.println("\nSorted array is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n~~~~~\n");
    }
}
