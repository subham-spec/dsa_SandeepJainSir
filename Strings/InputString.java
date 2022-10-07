// package strings;
import java.util.Scanner;
public class InputString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input int : ");
        int i;
        try {
            i = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.print("Input string : ");
        String s = sc.nextLine();
    }
}
