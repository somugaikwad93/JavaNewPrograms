package programs;


/*
* 5 = 5+4+3+2+1 = 15
* */
public class SumOfNaturalNumber {

    public static void main(String[] args) {
       int n = 4;
       int sum = 0;
       for(int i=1 ; i<=n ; i++){
           sum = sum + i;
       }
        System.out.println(sum);
    }
}
