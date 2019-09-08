
import java.util.*;

public class Main {

    public static ArrayList<Integer> box = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c[];
        int d[];

        a = sc.nextInt();
        b = sc.nextInt();

        c = new int[a];
        for (int i = 0; i < a; i++) {
            c[i] = sc.nextInt();
        }

        d = new int[b + 1];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= b; j++) {
                if (i == 0 && j % c[i] == 0) d[j] += 1;
                else {
                    if (j - c[i] >= 0) d[j] += d[j - c[i]];
                }
            }
        }

        System.out.println(d[b]);


        sc.close();


    }
}
