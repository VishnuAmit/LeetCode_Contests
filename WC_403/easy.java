// Problem link: https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/
class Solution {
    public double minimumAverage(int[] nums) {
        // // Brute force - tc: O(nlogn+2n) sc: O(n)
        // Arrays.sort(nums);
        // int n=nums.length;
        // int left=0;
        // int right=n-1;
        // ArrayList<Double> ans=new ArrayList<>();
        // while(left<=right){
        //     double avg_sum=(nums[left]+nums[right])/2.0;
        //     ans.add(avg_sum);
        //     left++;
        //     right--;
        // }
        
        // double min=100000.00;
        // for(int i=0;i<ans.size();i++){
        //     min=Math.min(min,ans.get(i));
        // }
        // return min;

        // Optimal - O(nlogn+n/2) sc: O(1)
        Double min=100000.00;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            double min_avg=(nums[i]+nums[nums.length-i-1])/2.0;
            if(min_avg<min){
                min=min_avg;
            }
        }
        return min;
    }
}