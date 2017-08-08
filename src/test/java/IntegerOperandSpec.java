import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zerosx on 8/8/2560.
 */
public class IntegerOperandSpec {
    @Test
    public void integerOperandShouldBe1(){
        IntegerOperand integerOperand =new IntegerOperand(1);
        Assert.assertEquals("1",integerOperand.toString());
    }

    @Test
    public void integerOperandShouldBe9(){
        IntegerOperand integerOperand = new IntegerOperand(9);
        Assert.assertEquals("9",integerOperand.toString());
    }

    @Test
    public void integerOperandShouldBe5(){
        IntegerOperand integerOperand = new IntegerOperand(5);
        Assert.assertEquals("5",integerOperand.toString());
    }
}
