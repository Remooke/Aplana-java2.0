package HomeWork5;

import java.io.Serializable;

public class Calculations {
    private static double num1;
    private static double num2;


    public Calculations(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static double getNum1() {
        return num1;
    }

    public static void setNum1(double num1) {
        Calculations.num1 = num1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double num2) {
        Calculations.num2 = num2;
    }

    public static double summ() {
        return num1 + num2;
    }

    public static double substraction() {
        return num1 - num2;
    }

    public static Serializable multiplication() {
                return num1 * num2;
    }

    public static double division () {
            if (num2 ==0){
              throw new ArithmeticException();
            }
            else  {
                return num1 / num2;
          }
    }

}

