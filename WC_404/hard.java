// Problem link: https://leetcode.com/problems/find-minimum-diameter-after-merging-two-trees/
class Solution {
    List<List<Integer>> adjl;
    int[] depth;
    int dia = 0;

    void dfs(int node, int par) {
        depth[node] = 0;
        int mx1 = 0, mx2 = 0;
        for (int child : adjl.get(node)) {
            if (child == par) continue;
            dfs(child, node);
            depth[node] = Math.max(depth[node], depth[child] + 1);
            int val = depth[child] + 1;
            if (val > mx1) {
                mx2 = mx1;
                mx1 = val;
            } else if (val > mx2) {
                mx2 = val;
            }
        }
        dia = Math.max(dia, mx1 + mx2);
    }

    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        // Optimal - tc: O(n+m) sc: O(n+m)
        int n = edges1.length + 1;
        int m = edges2.length + 1;

        adjl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjl.add(new ArrayList<>());
        }
        for (int[] e : edges1) {
            adjl.get(e[0]).add(e[1]);
            adjl.get(e[1]).add(e[0]);
        }
        depth = new int[n];
        dia = 0;
        dfs(0, -1);
        int d1 = dia;

        adjl = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            adjl.add(new ArrayList<>());
        }
        for (int[] it : edges2) {
            adjl.get(it[0]).add(it[1]);
            adjl.get(it[1]).add(it[0]);
        }
        depth = new int[m];
        dia = 0;
        dfs(0, -1);
        int d2 = dia;

        return Math.max(Math.max(d1, d2), (int) Math.ceil(d1 / 2.0) + (int) Math.ceil(d2 / 2.0) + 1);
    }
}
