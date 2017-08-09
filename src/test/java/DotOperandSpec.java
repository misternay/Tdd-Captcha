import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zerosx on 9/8/2560.
 */
public class DotOperandSpec {
    @Test
    public void dotOperandShouldBeDot(){
        DotOperand dotOperand = new DotOperand(1);
        Assert.assertEquals(".", dotOperand.toString());
    }

    @Test
    public void dotOperandShouldBeNineDot(){
        DotOperand dotOperand = new DotOperand(9);
        Assert.assertEquals(9, dotOperand.toString().length());
    }

    @Test
    public void dotOperandShouldBeFiveDot(){
        DotOperand dotOperand = new DotOperand(5);
        Assert.assertEquals(5,dotOperand.toString().length());
    }
}
