import java.util.Collections;
import java.util.ArrayList;
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Solution sol = new Solution();
        //Scanner in = new Scanner(System.in);
        int a = 9;
        int b = 7;
        int c = 9;
        int d = 7;
        try{
        System.out.println(sol.solution(a,b,c,d));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public String solution(int A, int B, int C, int D){
       if(A>=0 && B>=0 && C>=0 && D>=0){
           int countB = 0, countC= 0;
           
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(A);
        arr.add(B);
        arr.add(C);
        arr.add(D);
        Collections.sort(arr);
        for(int i=3; i>=0; i--){
            if(arr.get(i)<=2){
                A = arr.get(i);
                arr.remove(i);
                break;
            }
        }
        for(int i=2; i>=0; i--){
            if(A==2 && arr.get(i)<4){
                B = arr.get(i);
                arr.remove(i);
                break;
            }
            
            else if(A==1 || A==0){
                B = arr.get(i);
                arr.remove(i);
                break;
            }
            countB++;
            if(A==2 && countB==3){
                return "NOT POSSIBLE";
            }
        }
        
        for(int i=1; i>=0; i--){
            if(arr.get(i)<=6){
                C = arr.get(i);
                arr.remove(i);
                break;
            }
            countC++;
            if(countC==2){
                return "NOT POSSIBLE";
            }
        }
        D = arr.get(0);
        String as = Integer.toString(A);
        String bs = Integer.toString(B);
        String cs = Integer.toString(C);
        String ds = Integer.toString(D);
        String sol = as+bs+":"+cs+ds;
        return sol;
    }
    else{
        return "NOT POSSIBLE";
    }
}
}