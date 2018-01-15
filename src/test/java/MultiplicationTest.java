import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultiplicationTest {
    Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator =new Calculator();
    }

    @Test
    public void multiLongTest(){
        Assert.assertEquals(calculator.mult(20,5),100);
    }
}
