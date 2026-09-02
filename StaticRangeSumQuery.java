import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] prefix = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            prefix[i] = prefix[i - 1] + x;
        }
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long sum = prefix[b] - prefix[a - 1];
            System.out.println(sum);
        }
        sc.close();
    }
}
