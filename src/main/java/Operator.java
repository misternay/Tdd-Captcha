/**
 * Created by zerosx on 8/8/2560.
 */
public class Operator {
    private int operator;

    public Operator(int operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        String[] operatorArray = {"+", "*", "-"};

        return operatorArray[this.operator - 1];
    }
}
