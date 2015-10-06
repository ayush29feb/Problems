import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0) {
            String result = "Funny";
            String s = scanner.next();
            int[] diffS = new int[s.length() - 1];
            for(int i = 1; i < s.length(); i++) {
                diffS[i - 1] = s.charAt(i) - s.charAt(i - 1);
            }
            int n = diffS.length;
            for(int i = 0; i <= (n - 1) / 2; i++) {
                if(Math.abs(diffS[i]) != Math.abs(diffS[n - 1 - i])) {
                    result = "Not Funny";
                }
            }
            System.out.println(result);
            t--;
        }
    }
}
