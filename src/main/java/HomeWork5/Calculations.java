package HomeWork5;

public class Calculations {
    private static double num1;
    private static double num2;

    public Calculations(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public static double summ() {
        return num1+num2;
    }
    public static double substraction() {
        return num1-num2;
    }
    public static double multiplication() {
        return num1*num2;
    }
    public static double division() {
        return num1/num2;
    }

}

