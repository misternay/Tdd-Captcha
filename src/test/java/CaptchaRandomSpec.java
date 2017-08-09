import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by zerosx on 9/8/2560.
 */
public class CaptchaRandomSpec {

    @Test
    public void name() throws Exception {
        Random spy = mock(Random.class);
        CaptchaRandom captchaRandom = new CaptchaRandom(spy);
        captchaRandom.getPattern();

        verify(spy).nextInt(2);
    }

    @Test
    public void patternShouldBeRandom() throws Exception {
        oo7 spy = new oo7();
        CaptchaRandom captchaRandom = new CaptchaRandom(spy);
        captchaRandom.getPattern();
        //System.out.print(captchaRandom.getPattern());
        Assert.assertTrue(spy.verifyThatNextIntHasBeenCalledOnce());
        Assert.assertTrue(spy.verifyThatPatternBoundShouldBe2());
    }

    @Test
    public void operatorShouldBeRandom() throws Exception {
        oo7 spy = new oo7();
        CaptchaRandom captchaRandom = new CaptchaRandom(spy);
        captchaRandom.getOperator();
        //System.out.print(captchaRandom.getOperator());
        Assert.assertTrue(spy.verifyThatNextIntHasBeenCalledOnce());
        Assert.assertTrue(spy.verifyThatOperatorBoundShouldBe3());
    }

    class oo7 extends Random {
        private int log = 0;
        private int bound = 0;

        @Override
        public int nextInt(int bound) {
            this.bound = bound;
            log++;
            return 0;
        }

        public boolean verifyThatNextIntHasBeenCalledOnce() {
            return log == 1;
        }

        public boolean verifyThatPatternBoundShouldBe2() {
            return bound == 2;
        }

        public boolean verifyThatOperatorBoundShouldBe3(){
            return bound == 3;
        }
    }
}
