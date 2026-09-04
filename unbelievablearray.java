import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] A = new int[n + 1];  
            for (int i = 1; i <= n; i++) {
                A[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            System.out.println("Case " + t + ":");
            for (int i = 0; i < q; i++) {
                int type = sc.nextInt();
                if (type == 1) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    // Update mapping: all x should now map to y
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        if (entry.getValue() == x) {
                            entry.setValue(y);
                        }
                    }
                    map.put(x, y);
                } else {
                    int idx = sc.nextInt();
                    int val = A[idx];
                    // Resolve mapping chain
                    while (map.containsKey(val)) {
                        val = map.get(val);
                    }
                    System.out.println(val);
                }
            }
        }
        sc.close();
    }
}
