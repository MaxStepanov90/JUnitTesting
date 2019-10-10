
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    @Test
    public void testCalA()throws Exception{
        Calculate calculate = new Calculate();
        int n = calculate.CalA(2,2);
        assertEquals(4,n);
    }
}
