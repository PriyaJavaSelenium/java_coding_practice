package javaPracticeDaily_w3School;

public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 2;
        int add = a + b;
        int sub = b - c;
        int mul = a * b;
        int div = b / c;
        int mod = a % b;
        int inc = a++; // you have doubt in increment decrement operator and how it works
        int inc0 = ++a;
        int inc1 = ++b;
        int dec = a--;
        int dec1 = --c;
        a = 7;
        System.out.println(a == b);
        System.out.println(a < 3 && b < 10);
        System.out.println("add = " + add);
        System.out.println("sub = " + sub);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);
        System.out.println("inc = " + inc);
        System.out.println("inc0 = " + inc0);
        System.out.println("inc1 = " + inc1);
        System.out.println("dec = " + dec);
        System.out.println("dec1 = " + dec1);
    }
}
