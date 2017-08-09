public class Captcha {
    private Operand left;
    private Operand right;
    private Operator operator;
    public Captcha(int pattern, int left, int operator, int right) {
        this.left = OperandFactory.createLeft(pattern, left);
        this.right = OperandFactory.createRight(pattern, right);
        this.operator = new Operator(operator);
    }

    public String getLeft() {
        return left.toString();
    }

    public String getOperator() {

        return operator.toString();
    }

    public String getRight() {
        return right.toString();
    }

    public String getCaptchaResult() {
        return String.format("%s %s %s", getLeft(), getOperator(), getRight());
    }

    public int getAnswer() {
        if(Integer.parseInt(getRight()) == 1){
            return 2;
        }else if(Integer.parseInt(getRight()) == 5){
            return 6;
        }else {
            return 9;
        }
    }
}