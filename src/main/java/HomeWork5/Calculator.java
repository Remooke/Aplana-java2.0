package HomeWork5;

public class Calculator {

    private static double numberTwo;
    private static double numberOne;

    public static void main(String[] args) {
        numberOne = Read.numReader();// ввод первого числа
        String operations = Read.operationReader(); //выбор операции
        numberTwo = Read.numReader(); // ввод второго числа
        Calculations.calc(numberOne, operations, numberTwo); //вызов вычисления
    }
}
