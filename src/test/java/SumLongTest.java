import com.epam.tat.module4.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumLongTest {

    Calculator calculator = new Calculator();

    @Test
    public void sumLTest() {
        assertEquals(50, calculator.sum(25, 25));
    }

}
