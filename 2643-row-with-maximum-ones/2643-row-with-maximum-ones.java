class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans={0,0};
        int m = mat.length;

        
        for(int i=0;i<m;i++){
            int n = mat[i].length;
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>ans[1]){
                ans[1]=count;
                ans[0]=i;
            }
        }
        return ans;
    }
}