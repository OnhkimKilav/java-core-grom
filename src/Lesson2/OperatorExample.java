package Lesson2;

/**
 * Created by Valik on 26.01.2018.
 */
public class OperatorExample {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;

        int c1 = a / b; //devision - div
        int c2 = a % b; //modulus - mod

        System.out.println(c1);
        System.out.println(c2);

        a = a + 1;
        System.out.println(a);
        a++;    //increment
        System.out.println(a);

        a--;    //decrement
        System.out.println(a);

        int n = 10;

        a = a + n;
        System.out.println(a);
        a += n;
        System.out.println(a);
        a -= n;
        System.out.println(a);

        a -= 1011;
        System.out.println(a);
    }
}
