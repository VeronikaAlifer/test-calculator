import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubtractionDoubleTest {

    Calculator calculator;

    @BeforeClass
    public void setCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void subDTest(){
        Assert.assertEquals(calculator.sub(10.5,5.0),5.5);
        Assert.assertNotEquals(calculator.sub(6.6,3.0),3.6);
    }
}
