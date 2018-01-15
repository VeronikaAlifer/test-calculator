import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumLongDataProviderFactory {

    private long a;
    private long b;
    private long expected;
    Calculator calculator;

    @BeforeClass
    public void setCalculator() {
        calculator = new Calculator();
    }

    @Factory(dataProvider = "sumDataProvider")
    public SumLongDataProviderFactory(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void sumLongTest() {
        Assert.assertEquals(calculator.sum(a, b), expected);
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] DataProviderMethod() {
        return new Object[][]{
                {10, 10, 20},
                {20, 45, 65},
        };
    }
}
