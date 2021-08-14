package HomeWork5;

public class Calculations {

    public static void calc(double numberOne, String operations, double numberTwo) {
        double result = 0;
        switch (operations) {
            case "+":
                result = numberOne + numberTwo;
                System.out.printf("Сумма = %.4f", result);
                break;
            case "-":
                result = numberOne - numberTwo;
                System.out.printf("Разность = %.4f", result);
                break;
            case "/":
                result = numberOne / numberTwo;
                System.out.printf("Частное = %.4f", result);
                break;
            case "*":
                result = numberOne * numberTwo;
                System.out.printf("Произведение = %.4f", result);
                break;
            default:
                System.err.println("ERROR. Выберите корректную операцию");
        }
    }
}

