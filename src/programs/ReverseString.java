package programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String text = sc.nextLine();
        int ln = text.length();
        String rev = " ";
        for(int i = ln-1; i>=0 ; i--){
            rev = rev + text.charAt(i);
        }
        System.out.println(rev);
    }
}
