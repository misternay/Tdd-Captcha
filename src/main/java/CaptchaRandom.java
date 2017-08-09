import java.util.Random;

/**
 * Created by zerosx on 9/8/2560.
 */
public class CaptchaRandom {
    private Random random;
    public CaptchaRandom(Random random){
        this.random = random;
    }
    public int getPattern(){
        return  random.nextInt(2)+1;
        //return  0;
    }


    public int getOperator() {
        return random.nextInt(3)+1;
    }

}
