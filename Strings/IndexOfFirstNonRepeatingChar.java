package strings;
import java.util.*;
public class IndexOfFirstNonRepeatingChar {
    public static void main(String[] args){
        String s = "ukjguhga";
        int[] fi = new int[256];
        Arrays.fill(fi, -1);

        for(int i=0; i<s.length(); i++){
            if(fi[s.charAt(i)] == -1)
                fi[s.charAt(i)] = i;
            else
                fi[s.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i<256; i++){
            if(fi[i] >= 0)
                res = Math.min(res, fi[i]);
        }
        System.out.println(res);
    }
}
