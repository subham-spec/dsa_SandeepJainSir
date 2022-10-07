package strings;
import java.util.*;
public class IndexOfLeftmostRepeatingChar {
    public static void main(String[] args){
        String s = "geeksforgeeks";

        int arr[] = new int[26];
        Arrays.fill(arr, -1);

        int res = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++){
            int ind = arr[s.charAt(i)-97];
            if(ind == -1)
                arr[s.charAt(i)-97] = i;
            else
                res = Math.min(res, ind);
        }
        System.out.println(res); 
    }
}
