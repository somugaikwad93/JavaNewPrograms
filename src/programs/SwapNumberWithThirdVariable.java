package programs;

public class SwapNumberWithThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int t = b;
        b = a;
        a = t;



        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
    }
}
