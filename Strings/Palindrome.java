package strings;

public class Palindrome {
    public static void main(String[] args){
        String s = "abcdca";

        int l = s.length()-1;
        int i, j;
        for(j=l, i=0; i<=l/2; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("Not palindrome");
                break;
            }
        }
        if(i>l/2)
            System.out.println("Palindrome");
    }
}
