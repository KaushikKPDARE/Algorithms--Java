import java.util.HashMap;
import java.util.Set;
public class Hmap{
    
    public static void main(String[] args){
        String s="malayalam";
        char[] c=s.toCharArray();
        HashMap<Character,Integer> cmap= new HashMap<Character,Integer>();
        for(Character ch: c){
            if(cmap.containsKey(ch)){
                cmap.put(ch,cmap.get(ch)+1);
            }
            else{
                cmap.put(ch,1);
            }
        }
        for(HashMap.Entry<Character,Integer> e: cmap.entrySet()){
            if(e.getValue()>=2)
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}