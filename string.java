public class Solution
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Solution sol = new Solution();
    String str = "mala/yalam";
    str = str.replaceAll("/","");
    System.out.println(sol.solution(str));
  }
  
  public String solution(String s){
    StringBuilder str = new StringBuilder(); //We can use StringBuffer instead for thread safe(Synchronisation)
    str.append(s);
    String sf = str.reverse().toString();
    //return sf;
    if(sf.equals(s)){return "True";}
    else{return "False";}
  }
}

