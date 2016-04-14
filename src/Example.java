/**
 * Created by doug on 4/13/16.
 */
public class Example {

    public static void main(String[] args){

        double result = 125.1999999;
        double expected = 125.2;

        boolean matches = result == expected;

        // "125.1999999=125.2? false"
        System.out.println(result + "=" + expected + "? " + matches);

    }
}
