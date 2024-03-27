public class Consultation {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {2,25,28,3,8};

        System.out.println(finfDifference(arr2));

        System.out.println("** common elements in arrays");
        findCommonElts (arr1,arr2);
    }
    /*
    метод, находящий разность между макс и минэлементами целых ч.
    В массиве уже не менее 2 элементов и они разные
     */
    public static int finfDifference (int[] numbers){
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max) {
                max = numbers[i];
            }
            else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return max - min;
    }

    //метод, находящие общие эл. двух мас. целых и вывод на экран
    public static void findCommonElts (int[] arr1, int [] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1 [i] == arr2[j]){
                    System.out.println("common elt is " + arr1[i]);
                }
            }
        }
    }

}

