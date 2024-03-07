package programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rem=0;
        int rev=0;
        int temp = num;
        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(temp == rev){
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
}
