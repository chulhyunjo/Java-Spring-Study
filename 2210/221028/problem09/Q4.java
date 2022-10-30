package problem09;
import java.util.Scanner;
import java.util.ArrayList;

public class Q4 {
    public static int Fibo(int n){
        if (n==0) {
            return 0;
        } else if (n==1){
            return 1;
        } else{
            return Fibo(n-2) + Fibo(n-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i< n; i++){
            System.out.print(Fibo(i) + " ");
        }
    }
}
