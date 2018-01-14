import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SumDoubleTest {
    Calculator calculator = new Calculator();


    @Test
    public void sumDTest(){
        double res = calculator.sum(3,1);
        Assert.assertEquals(4,res,0);
    }

}
