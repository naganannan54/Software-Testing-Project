import java.lang.Math;

public class Calculator {

    public static void main(String arg) {
        System.out.println("Hello World!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b) { return a - b; }

    public int divide(int a, int b) { return a / b; }

    public int exponential(int a, int b){return (int) Math.pow(a,b);}

    public int modulo(int a, int b){return a%b;}

}