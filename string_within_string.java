//import java.lang.String;
public class Stringall{
    public static void main(String[] args){
         String a = "TuTo rial";
         String b = "ti r";
           if(a.replaceAll("\\s","").toLowerCase().contains(b.replaceAll("\\s","").toLowerCase())){
            System.out.println("True");
        }
        else { System.out.println("False");}
    }
}