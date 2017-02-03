import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Time {

    public static void main(String[] args) {
        int t1;
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String t, t2;
        if(time.substring(8,10).equals("PM"))
            {
            t = time.substring(0,2);
            t1 = Integer.parseInt(t);
            if(t1>=01 && t1<12){
            t1=t1+12;
            t2 = Integer.toString(t1);
            time = time.replace(time.substring(0,2),t2);
            System.out.println(time.substring(0,8));
            }
            else System.out.println(time.substring(0,8));
        }
        else if(time.substring(8,10).equals("AM"))
            {
            t = time.substring(0,2);
            t1 = Integer.parseInt(t);
            if(t1==12){
            //t1=00;
            //t2 = Integer.toString(t1);
            time = time.replace(time.substring(0,2),"00");
            System.out.println(time.substring(0,8));
            }
            else System.out.println(time.substring(0,8));
        }
    }
}