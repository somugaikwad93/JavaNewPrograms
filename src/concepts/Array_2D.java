package concepts;

public class Array_2D {
    public static void main(String[] args) {
        int[][] a = {{10,20,30},{40,50,70}};
        for (int i=0; i<a.length ; i++){
            for (int j=0; j<=a.length ; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
