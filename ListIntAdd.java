import java.util.*;
public class HelloWorld
{
  public static void main(String [] args)
  {
      List<Integer> l1 = new LinkedList<Integer>();
      l1.add(1);
      l1.add(2);
      l1.add(4);
      l1.add(7);
      l1.add(11);
      l1.add(15);
      int s= l1.size();
      int i=0;
      listAdd(l1,s,i);
  }
  
  static void listAdd(List<Integer> l2, int size, int i)
  {
      //l2 = new LinkedList<Integer>();
      if(l2.get(i)<l2.get(size-1))
      {
      if(l2.get(i)+l2.get(size-1)==11)
      {
      System.out.println("Hurray!!! It is ["+l2.get(i)+", "+l2.get(size-1)+"]");
      //break;
      }
      else if(l2.get(i)+l2.get(size-1)>11)
      {
       size--;
       listAdd(l2, size, i);
      }
      else if(l2.get(i)+l2.get(size-1)<11)
      {
       i++;
       listAdd(l2, size, i);
      }
    }
    else
    {
        System.out.println("Failure");
    }
  }
}