import java.util.*;
public class Main {
    private static int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }
    private static void join(int[] parent, int l, int r) {
        int x = find(parent, l);
        int y = find(parent, r);
        parent[y] = x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of nodes
        int m = sc.nextInt(); // number of edges
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            join(parent, l, r);
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            s.add(find(parent, i));
        }
        System.out.println(s.size());
        sc.close();
    }
}
