import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zerosx on 8/8/2560.
 */
public class OperatorSpec {
    @Test
    public void operatorShouldBePlus() {
        Operator operator = new Operator(1);
        Assert.assertEquals("+", operator.toString());
    }

    @Test
    public void operatorShouldBeMultiply() {
        Operator operator = new Operator(2);
        Assert.assertEquals("*", operator.toString());
    }

    @Test
    public void operatorShouldBeMinus() throws Exception {
        Operator operator = new Operator(3);
        Assert.assertEquals("-", operator.toString());
    }
}
