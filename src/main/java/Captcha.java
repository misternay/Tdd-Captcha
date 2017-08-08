public class Captcha {
    private int pattern;
    private Operand left;
    private int right;
    private Operator operator;
    private String[] numberStringArray = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public Captcha(int pattern, int left, int operator, int right) {
        this.pattern = pattern;
        this.left = OperandFactory.createLeft(pattern,left);
        this.right = right;
        this.operator = new Operator(operator);
    }

    public String getLeft() {
        return left.toString();
    }

    public String getOperator() {

        return operator.toString();
    }

    public String getRight() {

        if (this.pattern == 2) {
            return numberStringArray[this.right - 1];
        }
        return String.valueOf(this.right);
    }

    public String getCaptchaResult() {
        return  String.format("%s %s %s",getLeft(),getOperator(),getRight());
    }
}