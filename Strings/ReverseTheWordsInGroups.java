// package strings;
import java.util.*;
public class ReverseTheWordsInGroups {
    static void reverse(char str[],int low, int high){
        while(low<=high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }
    }
    static void reverseWords(char str[], int n){
        int start=0;
        for(int end=0; end<n; end++){
            if(str[end]==' '){
                reverse(str, start, end-1); 
                start=end+1;
            }
        }
        // for last group of words
        reverse(str, start, n-1);
        // for complete reverse of string
        reverse(str, 0, n-1);
    }
    public static String reverseWords(String s) {
        s = s.replaceAll("\\s+"," ").trim();
        int l = s.length();
        char[] str = s.toCharArray();
        reverseWords(str, l);
        // converting char array to string using valueOf() method of string class
        String string = String.valueOf(str);
        
        return string;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // System.out.println(s);
        
        String dt = reverseWords(s);
        
        System.out.println(dt);
    }
}
// jayesh is lori
// lori is jayesh
