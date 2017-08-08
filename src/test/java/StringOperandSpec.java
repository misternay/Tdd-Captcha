import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zerosx on 8/8/2560.
 */
public class StringOperandSpec {
    @Test
    public void stringOperandShouldBeOne() {
        StringOperand stringOperand = new StringOperand(1);
        Assert.assertEquals("One", stringOperand.toString());

    }

    @Test
    public void stringOperandShouldBeNine() {
        StringOperand stringOperand = new StringOperand(9);
        Assert.assertEquals("Nine", stringOperand.toString());
    }

    @Test
    public void stringOperandShouldBeFive() {
        StringOperand stringOperand = new StringOperand(5);
        Assert.assertEquals("Five", stringOperand.toString());
    }
}
