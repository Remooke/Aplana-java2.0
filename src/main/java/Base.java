/**
 * @author Andrey Petrov
 * @param num1 entering the first number
 * @param num2 entering the second number
 */

import java.util.Scanner;
public class Base {
    //калькулятор дробных чисел
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num1;
        Double num2;
        int d;
        System.out.println("Введите первое число:");
        num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        num2 = scanner.nextDouble();
        System.out.println("Выберите Пункт необходимой операции " + "(1 = сложение, 2 = вычитание, 3 = деление, 4 = умножение) ");
        d = scanner.nextInt();
        double result;
        switch (d){
            case 1:
                result = num1 + num2;
                System.out.printf("Сумма = %.4f", result );
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("Разность = %.4f", result );
                break;
            case 3:
                result = num1 / num2;
                System.out.printf("Частное = %.4f", result );
                break;
            case 4:
                result = num1 * num2;
                System.out.printf("Произведение = %.4f", result );
                break;
            default:
                System.err.println("ERROR. Выберите один из 4 пунктов");
        }
    }
}
