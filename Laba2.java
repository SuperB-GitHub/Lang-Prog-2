public class Laba2 {

    public static void main(String[] args) {
        main8(args);
    }
    public static void main1(String[] args) {
        int a =15;
        int b = 4;
        float c =(float)a/b;
        double d = a*1e-3+c;
        System.out.println(d);
    }
    public static void main2(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte) (i + f);
        System.out.println(b);
    }
    public static void main3(String[] args) {
        short num = 9;
        char zero = '0';
        int nine = (Character.digit(zero,10)+num);
        System.out.println(nine);
    }
    public static void main4(String[] args) {
        double d = (short) 2.50256e2d;
        char c = 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
    public static void main5(String[] args) {
        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
    public static void main6(String[] args) {
        int a = 50;
        int b = 17;
        double d = (double) a / b;
        System.out.println(d);
    }
    public static void main7(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte)a + b / c / e;
        System.out.println(d);
    }
    public static void main8(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + (double) (b / c) / e;
        System.out.println(d);
    }
}