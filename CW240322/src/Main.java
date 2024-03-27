import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    // String in Java - ссылочный тип переменной, объект
        /*

         */
        String word = "Hello";

        /*
        0 1 2 3 4 - индексы символов в строке
        H e l l o
         */

        // 2-й способ создания строки. Строка - это объект.
        String str = new String("String value in \"str\"");

        System.out.println(str);

        String java = new String ("Java"); //создается новый объект с новым адресом
        String java3 = new String ("Java"); //создается новый объект с новым адресом
        String java1 = "Java"; //проверяется содержание, если в таблице string pool такого нет, то создастся новый объект
        String java2 = "Java"; // такой объект уже есть, присваивается адрес в таблице

        System.out.println(java1 == java2); //сравниваются адреса хранения объектов, а не их содержание
        System.out.println(java == java1); //объекты неправильно сравнивать через ==
        System.out.println(java.equals(java3)); //правильное сравнение String

        java = "Hello";

        // Методы работы со строками

        //1. метод length() - возвращает длину строки
        System.out.println("Length of variable \"java\": " + java.length());

        //2. метод toCharArray - преобразует строку в массив символов
        char [] helloArray = java.toCharArray();
        System.out.println();
        System.out.println(Arrays.toString(helloArray));

        //пустая строка
        String empty = "";
        String space = " ";
        System.out.println();
        System.out.println("empty length is: " + empty.length());
        System.out.println("space length is: " + space.length());

        // siEmpty() - проверяет пустая ли строка = true/false
        System.out.println();
        System.out.println(empty.isEmpty());
        System.out.println(space.isEmpty());

        //null - отсутствие ссылки на объект
        String strX = null; //строка не указывает на объект, адрес отсутствует

        // concat() - объединение строк, аналог +
        System.out.println();
        String result = java.concat(space).concat("!!!");
        System.out.println(result);

        //charAt(in index) - извлечение символа, по аналогу получения элемента в массиве
        String name = "John";
        //J o h n
        //0 1 2 3
        System.out.println();
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.print("Last symbol of John: ");
        System.out.println(name.charAt((name.length()) -1));

        // equalsIgnoreCase - равенство строк игнорируя регистр
        System.out.println();
        System.out.println("EqualsIgnoreCase");
        String ann = "ANn";
        String ann1 = "aNN";
        System.out.println(ann.equalsIgnoreCase(ann1));

        //toUpperCase - перевод символов в верхний регистр
        //toLowerCase - перевод символов в верхний регистр
        System.out.println(ann.toUpperCase());
        System.out.println(ann.toLowerCase());

        //substring(n) - можно получить часть строки, n - индекс начала
        String george = "George";
        String partOfGeorge = george.substring(2); //получает строку с элемента под индексом 2 (включая)
        System.out.println();
        System.out.println(partOfGeorge);
        partOfGeorge = george.substring(2,5); //получает строку с элемента под индексом 2 до 5 (не включая)
        System.out.println(partOfGeorge);

        System.out.println();
        System.out.println("First half of George -> " + findHalfString("George"));

        System.out.println();
        System.out.println(ann + " is Anagram of " + ann1 + ": " + isAnagram(ann, ann1));

    }
        /*
        Дана строка четной длины.
        Написать метод, возвращающий первую половину этой строки
        Пример:
        Java -> Ja, George -> Geo
         */
    public static String findHalfString (String str){
        return str.substring(0,str.length()/2);
    }

    //Написать метод определяющий являются ли строки анаграммами
    public static boolean isAnagram (String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        char [] chars1 = str1.toCharArray();
        char [] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++){
            if (chars1[i] != chars2[i]){
                System.out.println(chars1[i] + " compere with " + chars2[i]);
                return false;
            }
        }
        return true;
    }

}
