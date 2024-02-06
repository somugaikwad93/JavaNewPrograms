package programs;

/*
* Java Program
* avaJ margorP
* */
public class ReverseEachWords {
    public static void main(String[] args) {
        String words = "Smart Programmer";
        String[] separatedWords = words.split(" ");
        String revString = "";
        for(int i=0 ; i<separatedWords.length ; i++){
            String word = separatedWords[i];
            String revWord = " ";
            for(int j=word.length()-1;j>=0 ; j--){
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        System.out.println(revString);
    }
}
