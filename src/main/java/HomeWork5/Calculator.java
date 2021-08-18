package HomeWork5;

import java.util.InputMismatchException;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Предлагается в начале ввести числа, а потом выбрать операцию для этих чисел");
        System.out.println("----------------------------------------------------------------------------");
        String error;
        try {
            Calculations calculations1 = new Calculations(Read.numReader(), Read.numReader());

            switch (Read.operationReader()) {
                case "+":
                    System.out.printf("Сумма = %.4f\n", Calculations.summ());
                    break;
                case "-":
                    System.out.printf("Разность = %.4f\n", Calculations.substraction());
                    break;
                case "/":
                    System.out.printf("Частное = %.4f\n", Calculations.division());
                    break;
                case "*":
                    System.out.printf("Произведение = %.4f\n", Calculations.multiplication());
                    break;
                default:
                    System.err.println("ERROR. Что-то не то, если введен некорректный опператор, то до этой ошибке не доходит, введен эксепшн в Calculation");
            }
            System.out.println("------------------------------------\n");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Возможен ввод только чисел в корректном формате. Ошибка: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка.Делить на ноль нельзя");
        } catch (Exception e) {
            System.out.println("Ошибка.Выберите корректный оператор");
        }
    }

}



