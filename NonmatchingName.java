
import java.util.*;

public class NonmatchingName {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {

            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();

            String Sa = sc.nextLine();
            String Sb = sc.nextLine();

            boolean[] unav = new boolean[26];  //Initialized with false

            for (char ch : Sa.toCharArray()) {
                unav[ch - 'a'] = true; //Sa as true
            }
            for (char ch : Sb.toCharArray()) {
                unav[ch - 'a'] = true; //Sb as true
            }

            boolean avail = false;

            for (int i = 0; i < 26; i++) {
                if (unav[i] == false) {
                    avail = true;
                    break;
                }
            }
            System.out.println(avail?"YES":"NO");
        }

    }
}