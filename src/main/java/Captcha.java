public class Captcha {
    private int left;
    private int right;
    private int operator;


    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public String getLeft() {
        String[] leftArray = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return leftArray[this.left - 1];
    }

    public String getOperator() {
        String[] operatorArray = {"+", "*", "-"};
        return operatorArray[this.operator - 1];
    }

    public String getRight() {
        return String.valueOf(this.right);
    }
}