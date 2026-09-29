class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet <Integer> set = new HashSet<>();
        int n=nums.length;
        if(k==0){
            return false;
        }
        if(k>n){
            k=n-1;
        }
        for(int i=0;i<k;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        for(int i=k;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.remove(nums[i-k]);
            set.add(nums[i]);
        }
        return false;
    }
}