// Problem link: https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
class Solution {
    public int minimumArea(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        
        // int maxcnt=0;
        // for(int i=0;i<row;i++){
        //     int cnt=0;
        //     for(int j=0;j<col;j++){
        //         if(grid[i][j]==1) cnt++;
        //     }
        //     maxcnt=Math.max(maxcnt,cnt);
        // }
        
        int min_row=row,max_row=-1;
        int min_col=col,max_col=-1;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    if(i<min_row) min_row=i;
                    if(i>max_row) max_row=i;
                    if(j<min_col) min_col=j;
                    if(j>max_col) max_col=j;
                }
            }
        }
        
        // if(max_row==-1) return 0;
        
//         int an_cnt=0;
//         for(int k=0;k<col;k++){
//             // int an_cnt=0;
//             for(int p=0;p<row;p++){
//                 if(grid[p][k]==1) an_cnt++;
//             }
//             // an_maxcnt=Math.max(an_maxcnt,an_cnt);
//         }
//         // return an_cnt;
        
//         if(row==0) return an_cnt;
//         else{
//         return an_cnt*maxcnt;
        
             int hgt=max_row-min_row+1;
            int wid=max_col-min_col+1;
        return hgt*wid;
    
        
    }
}