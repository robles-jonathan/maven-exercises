import com.google.common.base.Splitter;
import com.google.common.math.DoubleMath;

public class GuavaTester {
    public static void main(String[] args) {
        double num = Math.PI;
        double butInt = 7;

        System.out.println(num);

        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));

    }
}
