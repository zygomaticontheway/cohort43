import java.util.Arrays;

public class HW {
    public static void main(String[] args) {

        // Вывести нечетные элементы массива (по индексу)
        String [] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int j = 0; j < fruits.length; j++){
            if (j % 2 != 0) {
                System.out.println(fruits[j]);
            }
        }

        //Метод, выводящий количество четных чисел

        int [] array = {12,4,5,6,8,80};
        System.out.println("Amount of Even in array " + Arrays.toString(array) + " is " + amountOfEven(array));

    }
    public static int amountOfEven (int [] array) {
        int counter = 0;
        for (int i =0; i < array.length; i++){
            if (array[i] %2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
