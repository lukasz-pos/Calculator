import java.util.*;
import java.io.*;
import java.lang.*;

class Calculator {
	public double aPlusB(double a, double b){
        return a + b;
    }
    public double aMinusB(double a, double b){
        return a - b;
    }
}
class Application{
    public static void main(String[] args) {
        Calculator addition = new Calculator();
        double result = addition.aPlusB(5, 5);
        System.out.println(result);

        Calculator subtraction = new Calculator();
        double result2 = subtraction.aMinusB(5, 1);
        System.out.println(result2);
    }
}
