/**
 * Created by zerosx on 8/8/2560.
 */
public class OperandFactory {

    public static Operand createLeft(int pattern, int left) {
        if(pattern==1)
            return new StringOperand(left);
        return new IntegerOperand(left);
    }
}
