import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivideDoubleTest {
    Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(dataProvider = "divLongDataProvider")
    public void divideLongTest(long a, long b, long expected){
        Assert.assertEquals(calculator.div(a,b),expected);
    }
    @DataProvider(name = "divLongDataProvider")
    public Object[][] divDataProviderTest() {
        return new Object[][]{
                {10, 10, 1},
                {6, 2, 3},
                {10, 2, 5},
        };
    }
}
