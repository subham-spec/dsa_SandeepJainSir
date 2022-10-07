package strings;

public class Frequency {
    static void print_frequency(String str){
        int arr[] = new int[26];
        for(int i=0; i<str.length(); i++)
            arr[str.charAt(i)-97]++;
        for(int i=0; i<26; i++){
            if(arr[i]>0)
                System.out.println((char)(i+'a')+" : "+arr[i]);
        }

        return;
    }
    public static void main(String[] args){
        String s = "subhamsharma";
        print_frequency(s);
    }
}
