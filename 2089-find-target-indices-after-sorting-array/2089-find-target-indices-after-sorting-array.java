class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int countL=0;
        int countE=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                countL++;
            }
            else if(nums[i]==target){
                countE++;
            }
        }
        for(int i=0;i<countE;i++){
            list.add(countL++);
        }
        return list;
    }
}