// package strings;
import java.util.*;
public class CheckPalindrome {
    public static boolean checkPalindrome(String str) {
        str.replaceAll("\\s","");
        StringBuilder s = new StringBuilder();
	    for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if((c>=48 && c<=57) || (c>=97 && c<=122) || (c>=65 && c<=90))
                s.append(c);
        }
        if(s.length() == 0)
            return true;
        str = s.toString();
        String s2 = str.toLowerCase();
        int l = s2.length();
        for(int i=0; i<=l/2; i++)
            if(s2.charAt(i) != s2.charAt(l-1-i))
                return false;
        return true;
	}
    public static void main(String[] args){
        String s = "@";
        System.out.println(checkPalindrome(s));
    }
}
/**
f yes
@
A1b22Ba
cVsvc
-3#$=#dD3
aaBBa@
N2 i&nJA?a& jnI2n
codingninjassajNiNgNidoc
5?36@6?35   
rr 
nghhHGn
 h!la$&lH

 */