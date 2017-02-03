import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.HashSet;

public class Solution{
 publoic static void main(String[] args){
  int[] a={4,3,2,7,8,2,3,1};
  HashSet<Integer> al = new HashSet<Integer>();
  for(int i=0;i<a.length;i++){
  al.add(a[i]);
  }
  Collections.sort(al);
  for(int i=0; i<al.size();i++){
   if(al.get(i)!=i+1){
    System.out.println(i);
   }
  }
  }
}