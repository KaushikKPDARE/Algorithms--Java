import java.util.HashMap;
import java.util.Set;
public class Hmap{
    
    public static void main(String[] args){
        //String s="malayalam";
        int[] a={1,3,1,5,2,4,5,1};
        //char[] c=s.toCharArray();
        HashMap<Integer,Integer> cmap= new HashMap<Integer,Integer>();
        for(Integer in: a){
            if(cmap.containsKey(in)){
                cmap.put(in,cmap.get(in)+1);
            }
            else{
                cmap.put(in,1);
            }
        }
        for(HashMap.Entry<Integer,Integer> e: cmap.entrySet()){
            if(e.getValue()>=2)
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}