// package strings;
import java.util.*;
public class ReverseWordsOfString {
    static void reverse(char ar[], int i, int l){
        while(i<l){
            char c = ar[i];
            ar[i++] = ar[l];
            ar[l--] = c;
        }
    }
    static void reverseWords(char ch[]){
        int l = ch.length-1;
        int start = 0;
        for(int i=0; i<=l; i++){
            if(ch[i] == ' '){
                reverse(ch, start, i-1);
                start = i+1;
            }
        }
        reverse(ch, start, l);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s);
        char ch[] = s.toCharArray();
        reverseWords(ch);
        String str = new String(ch);
        System.out.println(str);
    }
}
