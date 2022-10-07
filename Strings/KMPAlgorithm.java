// package strings;

public class KMPAlgorithm {

    public static final int d = 256;

    static void search(String pat, String txt){
        int p = 5; // here we can put any prime number.

        int m = txt.length();
        int n = pat.length();
        int hp = 0; // for storing the hash value of the pattern
        int ht = 0; // for storing hash value of the text
        int h = 1;

        // the value of h would be pow(d, n-1)%p
        for(int i=0; i<n-1; i++)
            h = (h*d) % p;

        // calculating the hash value of the pattern for first window
        for(int i =0; i<n; i++){
            hp = (d * hp + pat.charAt(i)) % p;
            ht = (d * ht + txt.charAt(i)) % p;
        }

        // slide the pattern over the text one by one
        for(int i=0; i<=m-n; i++){
            if(hp == ht){
                // if the hash value is equal then check for the string one by one
                int j;
                for(j =0; j<n; j++){
                    if(txt.charAt(i+j) != pat.charAt(j))
                        break;
                }

                if(j == n)
                    System.out.println("Payttern found at the index "+ i);
            }
            // if pattern is still not crossing the main text.
            if (i < m-n){
                ht = (d*(ht - txt.charAt(i)*h) + txt.charAt(i+n)) % p;
                if(ht < 0)
                    ht = ht + p;
            }
        }
    }
    public static void main(String[] args){
        String txt = "geeksforgeeks";
        String pat = "gee";

        search(pat, txt);
    }
}
