package HomeWork5;

public class Calculations {
    private double result;
    private double num1;
    private double num2;
    private String op;

    public Calculations(double num1, String op, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public void calc() {
        System.out.println("------------РЕЗУЛЬТАТ---------------");
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.printf("Сумма = %.4f\n", result);
                break;
            case "-":
                result = num1 - num2;
                System.out.printf("Разность = %.4f\n", result);
                break;
            case "/":
                result = num1 / num2;
                System.out.printf("Частное = %.4f\n", result);
                break;
            case "*":
                result = num1 * num2;
                System.out.printf("Произведение = %.4f\n", result);
                break;
            default:
                System.err.println("ERROR. Выберите корректную операцию");
        }
        System.out.println("------------------------------------\n");
    }
}

