import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplicationDoubleTest {

    Calculator calculator;

    @BeforeClass
    public void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    @Parameters({"a", "b", "expected"})
    public void multiDoubleTest(double a, double b, double expected) {
        Assert.assertEquals(calculator.mult(a, b), expected);
    }
}
