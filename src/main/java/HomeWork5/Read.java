package HomeWork5;

import java.util.Scanner;

public class Read {

    private static double num;
    private static String operation;

    public static double numReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        num = scanner.nextDouble();
        return num;
    }

    public static String operationReader() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите Пункт необходимой операции ('+' сложение, '-' вычитание, '/' = деление, '*' = умножение)");
        operation = scanner.next();
        if (operation.equals("+") || operation.equals("+") || operation.equals("+") || operation.equals("+")) {
            return operation;
        } else {
            throw new Exception("Ошибка при выборе операции. Выберите корректную операцию");
        }

    }

}
