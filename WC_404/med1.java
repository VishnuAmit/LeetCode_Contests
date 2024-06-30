// Problem link: https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/description/
class Solution {
    public int maximumLength(int[] nums) {
        // Optimal - tc: O(n) sc: O(1)
        int odd=0,even=0,both=0, cur=nums[0]%2;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) even++;
            else odd++;
            if(nums[i]%2==cur){
                both++;
                cur=1-cur;
            }
        }
        return Math.max(both,Math.max(even,odd));
    }
}