import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionLongTest {
    Calculator calculator;

    @BeforeClass
    public void setCalculator() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "subLong")
    public void subLongTest(long a, long b, long expected) {
        Assert.assertEquals(calculator.sub(a, b), expected);
    }

    @DataProvider(name = "subLong")
    public Object[][] sunDataProvider() {
        return new Object[][]{
                {20, 30, -10},
                {0, 0, 0},
                {45, 10, 35}
        };
    }
}
