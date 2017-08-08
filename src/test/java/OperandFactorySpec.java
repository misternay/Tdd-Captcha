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
    public void secondPatternCreateStringOperandForLeft() {
        Assert.assertTrue(OperandFactory.createLeft(2, 1) instanceof IntegerOperand);
    }

}
