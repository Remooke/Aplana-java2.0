package HomeWork5;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Предлагается в начале ввести числа, а потом выбрать операцию для этих чисел");
        System.out.println("----------------------------------------------------------------------------");
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
                    System.err.println("ERROR. Выберите корректную операцию");
            }
            System.out.println("------------------------------------\n");



    }
}
