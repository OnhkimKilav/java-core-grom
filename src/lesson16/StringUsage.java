package lesson16;

/**
 * Created by Valik on 24.04.2018.
 */
public class StringUsage {
    public static void main(String[] args) {

        String test = "someString";
        String result = test + "_end";

        System.out.println(result);

        char charVariable = 't';
        char charVariable1 = '0';

        char[] chars = {charVariable, charVariable1};

        String test1 = new String(chars);
        System.out.println(test1);

        String test2 = new String("hello there");
        System.out.println(test2);
    }
}
