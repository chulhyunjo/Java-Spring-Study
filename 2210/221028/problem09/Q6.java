package problem09;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] numbers = userInput.split(",");
        int total = 0;
        for (String num: numbers) {
            num = num.trim();
            int n = Integer.parseInt(num);
            total += n;
        }
    }
}
