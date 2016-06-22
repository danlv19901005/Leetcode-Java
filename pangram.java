import java.util.Arrays;
import java.util.Scanner;

public class pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int sum = 0;
        int i;
        int[] a = new int[26];
        Arrays.fill(a, 1);        //for(i=0;i<26;i++) a[i]=1;
        for (i = 0; i < n; i++) {
            if (s.charAt(i) > 96)//lower case letter
                a[s.charAt(i) - 'a'] = 0;
            if (s.charAt(i) < 96 & s.charAt(i) > 64)//upper case letter
                a[s.charAt(i) - 'A'] = 0;
        }
        for (i = 0; i < 26; i++)
            sum += a[i];
        if (sum == 0)
            System.out.println("pangram");
        else
            System.out.println("not pangram");

    }
}