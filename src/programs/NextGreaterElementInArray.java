package programs;

/*
* Suppose int[] a = [4, 2, 6, 8, 1]
* 4 : 6
* 2 : 6
* 6 : 8
* 8 : null
* 1 : null
* */

public class NextGreaterElementInArray {
    public static void main(String[] args) {
        int[] a = {4, 2, 6, 8, 1};
        int next;
        for(int i = 0 ; i<a.length ; i++){
            next = 0;
            for (int j=i+1 ; j<a.length ; j++){
                if(a[i]<a[j]){
                    next = a[j];
                    break;
                }
            }
            System.out.println("The next greater element of " + a[i] + " is " + next);
        }
    }
}
