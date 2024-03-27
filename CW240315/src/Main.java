public class Main {

    // The scope of variables - область видимости переменных
    static int x = 9; //глобальная переменная, объявляется через static (но об этом позже)

    public static void main(String[] args) {

        System.out.println("x outside method main is " + x);
        int x = 10; //объявлена в методе main и видна только в нём

        if (x == 10) { //новый блок

            int y = 25; //видна только в этом блоке

            x = x * 4;
            // x и y видны в этом блоке
            System.out.println("x = " + x + ", y = " + y);
        }
    }


}
