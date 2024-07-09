// Problem link: https://leetcode.com/problems/alternating-groups-ii/
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        // Brute force - tc: O(n) sc: O(n+k-1)
    // int n=colors.length;
    // int cnt=0;
    // int myseqlen=1;
    // ArrayList<Integer> ans=new ArrayList<>();
    // for(int i=0;i<n;i++){
    //     ans.add(colors[i]);
    // }
    // // take k-1 els
    // for(int i=0;i<k-1;i++){
    //     ans.add(colors[i]);
    // }
        
    // for(int i=1;i<ans.size();i++){
    //     if(!ans.get(i).equals(ans.get(i-1))){
    //         myseqlen++;
    //     }else{
    //         myseqlen=1;
    //     }
        
    //     if(myseqlen>=k) cnt++;
    // }
    //     return cnt;

    // Optimal - tc: O(n) sc: O(1)
          int count = 0;
        int currentSequenceLength = 1;
        for (int i = 1; i < n + k - 1; i++) {
            int prevColor = colors[(i - 1) % n];
            int currentColor = colors[i % n];

            if (currentColor != prevColor) {
                currentSequenceLength++;
            } else {
                currentSequenceLength = 1;
            }

            if (currentSequenceLength >= k) {
                count++;
            }
        }

        return count;
    }
}