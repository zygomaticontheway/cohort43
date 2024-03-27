package consultation.equation.model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void display(){
        String delimeterB = b >= 0 ? " + " : " - ";
        String delimeterC = c >= 0 ? " + " : " - ";

        System.out.println(a + "* x^2 + " + delimeterB + Math.abs(b) + "x" + delimeterC + Math.abs(c) + " = 0");
    }
    public double delta (){
        return b * b - 4 * a * c;
    }

}
