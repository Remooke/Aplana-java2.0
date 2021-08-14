package HomeWork5;

public class Calculator {

    public static void main(String[] args) {
       Calculations calculations1 = new Calculations(Read.numReader(),Read.operationReader(), Read.numReader());
       calculations1.calc();

       Calculations calculations2 = new Calculations(Read.numReader(),Read.operationReader(), Read.numReader());
       calculations2.calc();
    }
}
