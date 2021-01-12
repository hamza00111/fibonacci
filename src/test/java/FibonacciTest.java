import com.codeworks.fibonacci.Fibonacci;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci();
    }

    @Test
    public void given_0_fibonacci_should_return_0() {
        long result = fibonacci.calculate(0);

        Assert.assertEquals(0, result);
    }

    @Test
    public void given_1_fibonacci_should_return_1() {
        long result = fibonacci.calculate(1);

        Assert.assertEquals(1, result);
    }

    @Test
    public void given_2_fibonacci_should_return_1() {
        long result = fibonacci.calculate(2);

        Assert.assertEquals(1, result);
    }

    @Test
    public void given_3_fibonacci_should_return_2() {
        long result = fibonacci.calculate(3);

        Assert.assertEquals(2, result);
    }

    @Test
    public void given_4_fibonacci_should_return_3() {
        long result = fibonacci.calculate(4);

        Assert.assertEquals(3, result);
    }

    @Test
    public void given_5_fibonacci_should_return_5() {
        long result = fibonacci.calculate(5);

        Assert.assertEquals(5, result);
    }

    @Test
    public void given_6_fibonacci_should_return_8() {
        long result = fibonacci.calculate(6);

        Assert.assertEquals(8, result);
    }

    @Test
    public void given_25_fibonacci_should_return_75025() {
        long result = fibonacci.calculate(25);

        Assert.assertEquals(75025, result);
    }

    @Test
    public void given_50_fibonacci_should_return_354224848179261915075() {
        long result = fibonacci.calculate(50);

        Assert.assertEquals(12586269025L, result);
    }
}
