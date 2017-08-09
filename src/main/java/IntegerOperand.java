/**
 * Created by zerosx on 8/8/2560.
 */
public class IntegerOperand implements Operand{
    private int operand;
    public IntegerOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {

        return String.valueOf(this.operand);
    }

    @Override
    public int getValue() {
        return this.operand;
    }

}
