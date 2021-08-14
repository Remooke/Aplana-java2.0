package HomeWork5;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("---------ПЕРВОЕ ВЫЧИСЛЕНИЕ--------");
        Calculations calculations1 = new Calculations(Read.numReader(), Read.operationReader(), Read.numReader());
        calculations1.calc(); //вычисление и результат
        System.out.println("---------ВТОРОЕ ВЫЧИСЛЕНИЕ--------");
        Calculations calculations2 = new Calculations(Read.numReader(), Read.operationReader(), Read.numReader());
        calculations2.calc(); //вычисление и результат
    }
}
