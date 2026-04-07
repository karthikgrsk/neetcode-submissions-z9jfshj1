class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
                
            }
            
        }
        return false;
    }
}