import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void add_one() {
        Assert.assertEquals(Calculator.add(-1,-1), -2);
    }
    @Test
    public void addMultiple(){

        Assert.assertEquals(Calculator.add(1,2,3,4,5), 15);
    }

    @Test
    public void add_two() {
        Assert.assertEquals(Calculator.add(1,2),3);
    }

    @Test
    public void multiply_one() {
        Assert.assertEquals(Calculator.multiply(1,2,3,4,5),120);

    }

    @Test
    public void multiply_two() {
        Assert.assertEquals(Calculator.multiply(1,3),3);
    }

    @Test
    public void multiply_three() {
        Assert.assertEquals(Calculator.multiply(-1,3),-3);
    }
}
