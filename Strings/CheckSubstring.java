package strings;

public class CheckSubstring {
    public static void main(String[] args){
        String a = "aabaacaadaabaaabaa";
        String b = "aaba";

        if(a.contains(b))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
