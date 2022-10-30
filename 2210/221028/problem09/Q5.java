package problem09;

import java.util.Scanner;

public class Q5 {
    static void gugu(int n){
        for (int i=1; i<10; i++){
            System.out.print(n*i + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단을 출력할 숫자를 입력하세요(2~9): ");
        int n = sc.nextInt();
        gugu(n);

    }
}
