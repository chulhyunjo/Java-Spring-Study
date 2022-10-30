package problem09;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Q8 {
    public static void main(String[] args) throws IOException{
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("abcd.txt"));
        while (true){
            String line = br.readLine();
            if (line==null) break;
            lines.add(line);
        }
        br.close();
        int total = 0;
        for (String line:lines){
            line = line.trim();
            int num = Integer.parseInt(line);
            total += num;
        }

        float average = (float) total/lines.size();

        PrintWriter pw = new PrintWriter("result2.txt");
        pw.write(String.format("%.2f", average));
        pw.close();

    }
}
