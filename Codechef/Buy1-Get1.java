import java.util.*;
import java.lang.Math;

class BUY1GET1{

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      int t = Integer.parseInt(scan.nextLine());
      while(t-->0){
         String line = scan.nextLine();
         
         int[] freq = new int[line.length()];
         int price = 0;
         
         int i = 0;
         while(!line.equals("")){
            String x = line.substring(0,1);
            freq[i] = line.length() - line.replace(x, "").length();
            line = line.replace(x, "");
            i++;
         }
                     
         for(int j = 0; j<i; j++){
            if(freq[j]%2 == 0){
               price += freq[j]/2;
            } else {
               price += (freq[j]+1)/2;
            }
         }
         
         System.out.println(price);
      }
   }

}