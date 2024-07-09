// Problem link: https://leetcode.com/problems/alternating-groups-i/
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt=0;
        int n=colors.length;
        for(int i=0;i<n;i++){
            int prev=colors[(i+n-1)%n];
            int cur=colors[i];
            int nex=colors[(i+n+1)%n];

            if(cur!=prev && cur!=nex) cnt++;
        }
        return cnt;
    }
}

