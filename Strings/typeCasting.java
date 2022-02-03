package Strings.src;

public class typeCasting {
    public static void main(String[] args) {
        byte a = 5; 
        int b = a;
        System.out.println(b);
        b = 300;
        a = (byte)b;
        System.out.println(a);
        float c = 3.5f;
        int d = (int)c;
        System.out.println(d);
    }
}
