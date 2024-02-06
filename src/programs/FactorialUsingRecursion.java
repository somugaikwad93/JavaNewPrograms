package programs;

/*
* Factorial using recurssion
* */

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int value = fact(5);
        System.out.println(value);
    }
    
    public static int fact(int n){
        if(n == 0)
            return 1;
        else
            return (n*fact(n-1));
    }
}
