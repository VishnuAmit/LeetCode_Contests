// Problem link: https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-ii/
class Solution {
    public int maximumLength(int[] nums, int k) {
        // Optimal - tc: O(nk) sc: O(nk)
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%k;
        }
        int[][] dp=new int[n][k];
        int[] last=new int[k];
        Arrays.fill(last,-1);
        int ans=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(last[j]==-1) dp[i][j]=1;
                else dp[i][j]=dp[last[j]][nums[i]]+1;
                ans=Math.max(ans,dp[i][j]);
            }
            last[nums[i]]=i;
        }
        return ans;
    }
    }
