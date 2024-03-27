public class Consult240314 {
    public static void main(String[] args) {
        calculateArea (2D);
        calculateArea (1.0);
    }

    /*
    так выглядит заголовок метода Method signature
    public static     void                    main      (           )
    [модификаторы] тип_возвращаемого_значения имя_метода([параметры]) {
    // тело_метода
    [return] //
    }
     */


    /*
    написать метод для вычисления площади круга
     */
    public static double calculateArea (double radius) {
        // S = P*r^2
        //double radius = 10.5;
        double area = Math.PI * radius * radius;
        System.out.println("Circle area is " + area);

        //double perimeter = 2 * Math.PI * radius;

        return area;
    }

}
