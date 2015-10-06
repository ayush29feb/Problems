import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase().replace(" ", "");
        int[] arr = new int[26];
        for(int x = 0; x < sentence.length(); x++) {
            arr[(int)sentence.charAt(x) - 97]++;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
