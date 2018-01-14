import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivideTest {

    Calculator calculator;

    @BeforeClass
    public void setCalculator() {
        calculator = new Calculator();
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divByZeroTest() {
        double res = calculator.div(10, 0);
    }

    @Test(dataProvider = "divDataProvider")
    public void divDoubleTest(double a, double b, double expected) {
        Assert.assertEquals(calculator.div(a, b), expected);
    }

    @DataProvider(name = "divDataProvider")
    public Object[][] divDataProviderTest() {
        return new Object[][]{
                {10.0, 10.0, 1.0},
                {6.5, 2.0, 3.25},
                {5.0, 0.0, Double.POSITIVE_INFINITY},
        };
    }
}


