import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zerosx on 8/8/2560.
 */
public class CaptchaSpec {

    private final int dummyOperator = 1;
    private final int dummyRight = 1;
    private final int dummyPattern = 1;
    private final int dummyLeft = 1;

    @Test
    public void firstPatternLeftShouldBeOne(){
        Captcha captcha = new Captcha(1,1, dummyOperator, dummyRight);
        Assert.assertEquals("One",captcha.getLeft());
    }
    @Test
    public void firstPatternLeftShouldBeNine(){
        Captcha captcha = new Captcha(1,9, dummyOperator, dummyRight);
        Assert.assertEquals("Nine",captcha.getLeft());
    }

    @Test
    public void firstPatternLeftShouldBeFive(){
        Captcha captcha = new Captcha(1,5,1,1);
        Assert.assertEquals("Five",captcha.getLeft());
    }

    @Test
    public void operatorShouldBePlus(){
        Captcha captcha = new Captcha (dummyPattern, dummyLeft,1,dummyRight);
        Assert.assertEquals("+",captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMultiply(){
        Captcha captcha = new Captcha (dummyPattern, dummyLeft,2,dummyRight);
        Assert.assertEquals("*",captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMinus(){
        Captcha captcha = new Captcha (dummyPattern, dummyLeft, 3, dummyRight);
        Assert.assertEquals("-", captcha.getOperator());
    }

    @Test
    public void firstPatternRightShouldBe1(){
        Captcha captcha = new Captcha(1,dummyLeft,dummyOperator,1);
        Assert.assertEquals("1",captcha.getRight());
    }

    @Test
    public void firstPatternRightShouldBe9(){
        Captcha captcha = new Captcha(1,dummyLeft,dummyOperator,9);
        Assert.assertEquals("9",captcha.getRight());

    }

    @Test
    public void firstPatternRightShouldBe5(){
        Captcha captcha = new Captcha(1,dummyLeft,dummyOperator,5);
        Assert.assertEquals("5",captcha.getRight());

    }

    @Test
    public void firstPatternRightShouldBe7(){
        Captcha captcha = new Captcha(1,dummyLeft,dummyOperator,7);
        Assert.assertEquals("7",captcha.getRight());
    }
}