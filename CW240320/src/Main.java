import java.util.Arrays;

public class Main {
    //Array массивы
    /*
    Массив - набор переменных одного типа, имеющий имя.
    type [] array-name = new type [size];
     */

    public static void main(String[] args) {
        int [] sample = new int[10]; //Массив из 10 целых чисел. Под этот массив отводится нужное кол-во памяти

        int [] sample1;
        sample1 = new int[10];

        //Индексы: 0 1 2 3 4 5 6 7 8 9
        //Индекс последнего элемента массива всегда на единицу меньше размера массива (т.к. начинается с 0).
        //sample [size -1] // обращение к последнему элементу массива



        sample[0] = 40;
        sample[2] = 100;
        int mos = sample[2];//присвоение значения переменной i через обращение к элементу массива с индексом 2

        System.out.println(mos);
        System.out.println(Arrays.toString(sample)); //вывод массива с конвертацией в строку
        System.out.println(sample[0]);

        // второй способ объявления массива: присвоить значения элементов

        int [] numbers = new int [] {10, 56, 4, 90};

        System.out.println(numbers[0]);

        //третий способ создания массива:
        int [] nums = {30, 60, 6, 99};
        System.out.println("Print nums []:");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        //System.out.println(nums[4]);

        nums [2] = 10;
        System.out.println("Nums [2] now is: " + nums [2]);
        System.out.println("Nums [3] is: " + nums [3]);

        //length - (длина) размер массива
        System.out.println("nums [] length is: " + nums.length); //вывод длины массива

        System.out.println("** Array nums is printed in loop");
        //вывести массив nums на печать в цикле

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element nums [" + i + "] is: " + nums [i]);
        }

        /*
        создать массив из 10 целых чисел, заполнить его значениями и вывести на печать в цикле
         */
        System.out.println(" ** Ins array");

        //1. Объявляем массив из 10 элементов целого типа
        int [] ints = new int [10];

        //2. Присваиваем значения элементам
        for (int i = 0; i < ints.length; i++) {
            ints [i] = i + 1;
        }

        //3. Выводим значения на экран
        for (int i = 0; i < ints.length; i++) {
            System.out.println("ints [" + i + "] = " + ints [i]);
        }
        System.out.println("~~~~~ end inst array\n");

        System.out.println(" ** Names array");
        String [] names = {"John", "Marry", "Ann", "Peter"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("names [" + i + "] = " + names [i]);
        }
        System.out.println("~~~~~ end Names array\n");

        names [1] = "Kate";

        System.out.println(" ** Names array with Kate");
        for (int i = 0; i < names.length; i++) {
            System.out.println("names [" + i + "] = " + names [i]);
        }
        System.out.println("~~~~~ end Names array with Kate\n");

        names[names.length -1] = "Tom"; //замена последнего элемента
        names[names.length -2] = "Jack"; //замена предпоследнего элемента
        System.out.println(" ** Names array with Tom");
        for (int i = 0; i < names.length; i++) {
            System.out.println("names [" + i + "] = " + names [i]);
        }
        System.out.println("~~~~~ end Names array with Tom\n");

        // Добавить еще 2 имени в массив - размер массива превысит размер старого на 2 элемента

        String [] newNames = new String[names.length + 2]; //создаем новый массив с размером  +2 элементами к старому

        //копируем элемены из старого в новый
        for (int i = 0; i < names.length; i++) {
            newNames [i] = names [i];
        }
        System.out.println("** newNames array:");
        for (int i = 0; i < newNames.length; i++) {
            System.out.println("names [" + i + "] = " + newNames [i]);
        }
        System.out.println("~~~~~ end newNames array \n");

        newNames [newNames.length -1] = "Ben";
        newNames [newNames.length -2] = "Jim";
        System.out.println("** newNames array + Ben & Jim:");
        for (int i = 0; i < newNames.length; i++) {
            System.out.println("names [" + i + "] = " + newNames [i]);
        }
        System.out.println("~~~~~ end newNames array + Ben & Jim\n");

        int [] array = {4, 10, 50, 7};
        System.out.println("** Printing max element of array");
        findMax(array);

    }
    /*
    написать метод, выводящий максимальный элемент массива
     */
    public static void findMax (int [] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element in array is: " + max + "\n~~~~~");
    }

    /*
    for-each цикл сокращёной записи цикла

    for ( type variable : array ) {
    statements
    }

     */
}
