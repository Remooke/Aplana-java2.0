import HomeWork5.Calculations;
import HomeWork5.Read;
import org.junit.Assert;
import org.junit.Test;

public class TestCalc {

    @Test
    public void testCalcSumm(){
        Calculations.setNum1(0);
        Calculations.setNum2(1);
        Assert.assertEquals("сумма 0 и 1 должна равняться 1",1,Calculations.summ(), 0);
    }

    @Test
    public void testCalcSubstraction(){
        Calculations.setNum1(0);
        Calculations.setNum2(-1);
        Assert.assertEquals("Некорректное вычитание",1,Calculations.substraction(), 0);
    }

    @Test
    public void testCalcMult(){
        Calculations.setNum1(-2);
        Calculations.setNum2(-1);
        Assert.assertEquals("Некорректное умножение",2,Calculations.multiplication(), 0);
    }

    @Test
    public void testCalcDivision(){
        Calculations.setNum1(-2);
        Calculations.setNum2(-1);
        Assert.assertEquals("Некорректное деление",2,Calculations.multiplication(), 0);
    }

    @Test
    public void testCalcDivisionZero(){
        Calculations.setNum1(-2);
        Calculations.setNum2(0);
        Assert.assertEquals("Некорректное деление на 0",0,Calculations.multiplication(), 0);
    }

    @Test
    public void testGetNumber(){
        Read.setNum(5);
        Assert.assertEquals(5,Read.getNum(), 0);
    }


}
