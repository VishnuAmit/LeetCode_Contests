// Problem link: https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/description/

class Solution {
    public long solver(int nums[],int flag, int ind, long[][] dp){
        if(ind==nums.length) return 0;
        if(dp[ind][flag]!=-1){
            return dp[ind][flag];
        }
        long a=0;
        long b=0;
        if(flag==0){
            a=nums[ind]+solver(nums,0,ind+1,dp);
            b=-1*nums[ind]+solver(nums,1,ind+1,dp);
        }else{
            a=nums[ind]+solver(nums,0,ind+1,dp);
            return dp[ind][flag]=a;
        }
        return dp[ind][flag]=Math.max(a,b);
    }
    public long maximumTotalCost(int[] nums) {
        // Optimal - tc: O(n) sc: O(n)
        long[][] dp=new long[nums.length][2];
        for(long[] row:dp){
            Arrays.fill(row,-1);
        }
     return nums[0]+solver(nums,0,1,dp);
        
    }
}