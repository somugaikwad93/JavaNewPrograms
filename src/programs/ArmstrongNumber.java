package programs;

import java.util.Scanner;

// 12 = 1*1 + 2*2

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 370;
        int t1 = num;
        int t2 = num;
        int digit=0;
        while(t1!=0){
            digit++;
            t1 = t1/10;
        }
        int rem;
        int n = 0;
        while(t2!=0){
            int multiply = 1;
            rem = t2%10;
            for(int i = 0 ; i < digit ; i++){
                multiply = multiply * rem;
            }
            n = n + multiply;
            t2 = t2/10;
        }
        if(n == num){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("No Armstrong");
        }
    }
}
