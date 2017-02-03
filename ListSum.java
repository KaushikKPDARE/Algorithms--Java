import java.util.*;
public class HelloWorld
{
  public static void main(String [] args)
  {
      List<Integer> l1 = new LinkedList<Integer>();
	  List<Integer> l2 = new LinkedList<Integer>();
      l1.add(7);
      l1.add(2);
      l1.add(4);
      //l1.add(3);
      int s1= l1.size();
	  l2.add(5);
      l2.add(6);
      l2.add(4);
      int s2= l2.size();
      int carry=0;
      listAdd(l1,l2,s1,s2,carry);
  }
  
  static void listAdd(List<Integer> l1, List<Integer> l2, int size1, int size2, int carry)
  {
	  int result,op;
	  List<Integer> list = new LinkedList<Integer>();
	  /*if(l1.get(size1-1)==null && l2.get(size2-1)!=null)
	  {
		  l1.add(0);
	  }
	  else if(l1.get(size1-1)!=null && l2.get(size2-1)==null)
	  {
		  l2.add(0);
	  }*/
	 try{ if(size1>=0 || size2>=0){
		  result = carry + l1.get(size1-1)+ l2.get(size2-1);
		  carry = result/10;
		  op = result%10;
		  list.add(op);
		  size1--;
		  size2--;
		  listAdd(l1, l2, size1, size2, carry);
	  }
	  else{
	  System.out.println("List: "+list);
	  }
	 }
	 catch(Exception e){System.out.println("Exception: "+e);}
  }
}