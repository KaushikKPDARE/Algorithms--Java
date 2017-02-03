import java.util.*;

public class HelloWorld{
 public static void main(String[] args){
  int[] a={1,1,1,1,1,1,5,1,1};
  int middle, h, l;
  h= a.length-1;
  l=0;
  int sum1=0, sum2=0;
  middle=(h+l)/2;
  for(int i=0;i<=middle;i++){
   sum1 = sum1+a[i];
  }
  System.out.println(sum1);
  for(int i=middle+1;i<a.length;i++){
   sum2 = sum2+a[i];
  }
  System.out.println(sum2);
  int total = sum1+sum2;
  System.out.println(total);
  if(total%2==0)
  computation(sum1,sum2,a,middle,total);
  else{System.out.println("Split cannot be made");}
  
 }
 
  public static void computation(int sum1, int sum2, int a[], int middle, int total){
  
  if(sum1==sum2){
   System.out.println("Split is equal "+ sum1);
  }
  else{
      System.out.println("Split is not equal");
      if(sum1>sum2){
          sum1 = sum1-a[middle];
          System.out.println(sum1);
          sum2 = total-sum1;
          middle--;
          computation(sum1,sum2,a,middle,total);}
    
    else if(sum1<sum2){
          sum1 = sum1+a[middle++];
          System.out.println(sum1);
          sum2 = total-sum1;
          System.out.println(middle);
          //middle++;
          computation(sum1,sum2,a,middle,total);}
    }
 }
}