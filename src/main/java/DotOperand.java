import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Created by zerosx on 9/8/2560.
 */
public class DotOperand implements Operand {


    private final int operand;

    public DotOperand(int operand) {
        this.operand = operand;

    }

    @Override
    public String toString() {

        return Stream.generate(()->".").limit(this.operand).collect(joining());
    }

    @Override
    public int getValue() {
        return this.operand;
    }
}
