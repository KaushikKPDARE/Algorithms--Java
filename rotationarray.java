import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
		
//Logic for array rotation
   int temp=0;
for(int j=0;j<k;j++){
for(int i=0; i<n; i++){
 
  if(i==0){
  temp = a[0]; 
  
    a[i] = a[n-1-i];}
     
     else{
      a[n-i]=a[n-1-i];
       if(n-1-i==0){
        a[n-i]=temp;
       }
     }
 
}
}
//Logic for array rotation

for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }
    }
}
