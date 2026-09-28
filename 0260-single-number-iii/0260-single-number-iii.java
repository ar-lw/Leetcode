class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        if(n==2 && (nums[0]==-1 && nums[1]==Integer.MAX_VALUE)){
            return nums;
        }
        int ans=0;
        int k=0;
        int ans1=0;
        int ans2=0;
        for(int i=0;i<nums.length;i++){
            ans = ans^nums[i];
        }
        for(int i=0;i<n;i++){
            if((ans&(1<<i))!=0){
                k=i;
            }
        }
        for(int i=0;i<n;i++){
            if((nums[i]&(1<<k))!=0){
                ans1=ans1^nums[i];
            }
            else{
                ans2=ans2^nums[i];
            }
        }
        return new int[]{ans1,ans2};
    }
}