import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by zerosx on 8/8/2560.
 */
@RunWith(JUnitParamsRunner.class)
public class CaptchaSpec {

    private final int dummyOperator = 1;
    private final int dummyRight = 1;
    private final int dummyPattern = 1;
    private final int dummyLeft = 1;

    @Test
    public void firstPatternLeftPlusRightShouldBeTwo() throws Exception {
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals(2,captcha.getAnswer());
    }

    @Test
    public void firstPatternLeftPlusRightShouldBeSix() throws Exception {
        Captcha captcha = new Captcha(1,1,1,5);
        Assert.assertEquals(6,captcha.getAnswer());
    }

    @Test
    public void firstPatternLeftPlusRightShouldBeNine() throws Exception {
        Captcha captcha = new Captcha(1,1,1,8);
        Assert.assertEquals(9,captcha.getAnswer());
    }

    @Test
    public  void  firstPatternLeftPlusRight(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("One + 1",captcha.getCaptchaResult());
    }

    @Test
    public void secondPatternRightShouldBeNine() throws Exception {
        //arrange
        Captcha captcha = new Captcha(2, dummyLeft, dummyOperator, 9);
        //act
        String right = captcha.getRight();
        //assert
        Assert.assertEquals("Nine", right);
    }

    @Test
    public void secondPatternRightShouldBeOne() {
        Captcha captcha = new Captcha(2, dummyLeft, dummyOperator, 1);
        Assert.assertEquals("One", captcha.getRight());
    }

    @Test
    public void secondPatternRightShouldBeFive() {
        Captcha captcha = new Captcha(2, dummyLeft, dummyOperator, 5);
        Assert.assertEquals("Five", captcha.getRight());
    }

    @Test
    public void secondPatternLeftShouldBe5() {
        Captcha captcha = new Captcha(2, 5, dummyOperator, dummyRight);
        Assert.assertEquals("5", captcha.getLeft());
    }

    @Test
    public void secondPatternLeftShouldBe1() {
        Captcha captcha = new Captcha(2, 1, dummyOperator, dummyRight);
        Assert.assertEquals("1", captcha.getLeft());
    }

    @Test
    public void secondPatternLeftShouldBe9() {
        Captcha captcha = new Captcha(2, 9, dummyOperator, dummyRight);
        Assert.assertEquals("9", captcha.getLeft());
    }

    /*@Test
    public void firstPatternLeftShouldBeOne() {
        Captcha captcha = new Captcha(1, 1, dummyOperator, dummyRight);
        Assert.assertEquals("One", captcha.getLeft());
    }

    @Test
    public void firstPatternLeftShouldBeNine() {
        Captcha captcha = new Captcha(1, 9, dummyOperator, dummyRight);
        Assert.assertEquals("Nine", captcha.getLeft());
    }

    @Test
    public void firstPatternLeftShouldBeFive() {
        Captcha captcha = new Captcha(1, 5, 1, 1);
        Assert.assertEquals("Five", captcha.getLeft());
    }*/

    @Test
    @Parameters({
            "1, 5, 1, 1, Five",
            "1, 9, 1, 1, Nine"
    })
    public void name(int pattern, int left, int operator, int right, String result) throws Exception {
        Captcha captcha = new Captcha(pattern, left, operator, right);
        Assert.assertEquals(result, captcha.getLeft());
    }

    @Test
    public void operatorShouldBePlus() {
        Captcha captcha = new Captcha(dummyPattern, dummyLeft, 1, dummyRight);
        Assert.assertEquals("+", captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMultiply() {
        Captcha captcha = new Captcha(dummyPattern, dummyLeft, 2, dummyRight);
        Assert.assertEquals("*", captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMinus() {
        Captcha captcha = new Captcha(dummyPattern, dummyLeft, 3, dummyRight);
        Assert.assertEquals("-", captcha.getOperator());
    }

    @Test
    public void firstPatternRightShouldBe1() {
        Captcha captcha = new Captcha(1, dummyLeft, dummyOperator, 1);
        Assert.assertEquals("1", captcha.getRight());
    }

    @Test
    public void firstPatternRightShouldBe9() {
        Captcha captcha = new Captcha(1, dummyLeft, dummyOperator, 9);
        Assert.assertEquals("9", captcha.getRight());

    }

    @Test
    public void firstPatternRightShouldBe5() {
        Captcha captcha = new Captcha(1, dummyLeft, dummyOperator, 5);
        Assert.assertEquals("5", captcha.getRight());

    }

    @Test
    public void firstPatternRightShouldBe7() {
        Captcha captcha = new Captcha(1, dummyLeft, dummyOperator, 7);
        Assert.assertEquals("7", captcha.getRight());
    }
}