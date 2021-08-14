package HomeWork5;

import java.util.Scanner;

public class Read {

    private static double num;
    private static String operation;

    public static double numReader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        num = scanner.nextDouble();
        return num;
    }

    public static String operationReader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите Пункт необходимой операции ('+' сложение, '-' вычитание, '/' = деление, '*' = умножение)");
        operation = scanner.next();
            return operation;

    }

}
