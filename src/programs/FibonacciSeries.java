package programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for(int i=1;i<=num;i++) {
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
