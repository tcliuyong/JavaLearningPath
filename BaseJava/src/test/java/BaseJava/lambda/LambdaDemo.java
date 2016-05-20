package BaseJava.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liuyong on 2016/5/20.
 */
public class LambdaDemo {

    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        players.forEach((player) -> System.out.print(player + "; "));

    }
}
