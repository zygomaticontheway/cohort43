public class ContinueBreak {

    // Break в циклах служит для выхода из цикла

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }
        System.out.println("~~~~~ After For with break\n");

        // Continue когда программа его встречает, происходит переход к началу следующей итерации цикла.
        // При этом оставшиеся после continue команды в текущей итерации прохода цикла пропускаются.

        System.out.println("~~~~~ Continue");

        for (int i = 0; i <= 10; i++) {

            if (i < 6) {
                continue;
            }

            System.out.println(i);
        }
        System.out.println("~~~~~ After For with continue\n");

        System.out.println("~~~~~ Continue with While");

        int j = 0;

        while (j < 10) {
            if (j == 6) {
                j++; //если это не написать, а указать j++ после continue, то цикл зависнет, т.к. инкремент пропустит
                continue;
            }
            System.out.println(j);
            // j++; указано до continue. Если здесь, то работать не будет
        }
        System.out.println("~~~~~ After Continue with While\n");
    }

}
