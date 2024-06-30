// Problem link: https://leetcode.com/problems/maximum-height-of-a-triangle/
class Solution {
    public int calcheight(int red, int blue){
        int row=1;
        int hgt=0;
        while(true){
            if(row%2==1){
                if(red>=row){
                    red-=row;
                }else{
                    break;
                }
            }else{
                if(blue>=row){
                    blue-=row;
                }else{
                    break;
                }
            }
            row++;
            hgt++;
        }
        return hgt;
    }
    public int maxHeightOfTriangle(int red, int blue) {
        // Optimal - tc: O(n) sc: O(1)
        return Math.max(calcheight(red,blue),calcheight(blue,red));
        
    }
}