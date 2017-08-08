/**
 * Created by zerosx on 8/8/2560.
 */
public class StringOperand implements Operand {
    private int operand;


    public StringOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        String[] number = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        return number[this.operand - 1];
    }
}
