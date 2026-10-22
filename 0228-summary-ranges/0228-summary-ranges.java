class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        if(nums.length==0){
            return ans;
        }
        int rangeS=nums[0];
        int rangeE=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]-nums[i]!=-1){
                rangeE=nums[i-1];
                if(rangeS==rangeE){
                ans.add(String.valueOf(rangeS));
            }
            else{
                ans.add(rangeS+"->"+rangeE);
            }
            rangeS=nums[i];
        }
            }
            
        rangeE=nums[nums.length-1];
        if(rangeS==rangeE){
            ans.add(String.valueOf(rangeS));
        }
        else{
            ans.add(rangeS+"->"+rangeE);
        }
        

        return ans;
    }
}