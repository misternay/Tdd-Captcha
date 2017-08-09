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

    public int calculate(int left, int right) {
        final int MULTIPLY = 2;
        final int MINUS = 3;

        if (this.operator == MULTIPLY)
            return left * right;
        if (this.operator == MINUS)
            return left - right;
        return left + right;
    }
}
