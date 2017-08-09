import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zerosx on 8/8/2560.
 */
public class OperandFactorySpec {

    @Test
    public void firstPatternCreateStringOperandForLeft() {
        Assert.assertTrue(OperandFactory.createLeft(1, 1) instanceof StringOperand);
    }

    @Test
    public void secondPatternCreateIntegerOperandForLeft() {
        Assert.assertTrue(OperandFactory.createLeft(2, 1) instanceof IntegerOperand);
    }

    @Test
    public void firstPatternCreateIntegerOperandForRight() {
        Assert.assertTrue(OperandFactory.createRight(1, 1) instanceof IntegerOperand);
    }

    @Test
    public void secondPatternCreateStringOperandForRight() {
        Assert.assertTrue(OperandFactory.createRight(2, 1) instanceof StringOperand);
    }
}
