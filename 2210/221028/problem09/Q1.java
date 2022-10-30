package problem09;

public class Q1 {
    public static void main(String[] args){
        String word = "a:b:c:d";
        String[] result = word.split(":");
        String ans = String.join("#",result);
        System.out.println(ans);
    }
}
