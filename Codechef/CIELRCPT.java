import java.io.*;
import java.util.*;
import java.lang.Math;

class CIELRCPT {
   
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int t = scanner.nextInt();
      
      while(t-->0){
         int items = 0;
         int p = scanner.nextInt();
         int i = 11;
         while(p>0){
            while(Math.pow(2,i)>p){
               i--;
            }
            items++;
            p -= Math.pow(2,i);
         }
         System.out.println(items);
      }
      
   }
   
}