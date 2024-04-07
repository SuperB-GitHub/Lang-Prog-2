import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        String[] value = {"AB","BC","AC"};
        String a = Arrays.toString(value);
        System.out.println(a);
        System.out.println(a.contains("AB"));
        System.out.println(a.contains("BC"));
        System.out.println(a.contains("CD"));
        System.out.println(a.contains("AE"));
    }
}
