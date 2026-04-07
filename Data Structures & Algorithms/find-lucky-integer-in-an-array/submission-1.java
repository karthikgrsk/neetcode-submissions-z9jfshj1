class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];

        for(int i=0;i<arr.length;i++){
             freq[arr[i]]++;
        }
        int maxi=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == freq[arr[i]]){
                maxi=Math.max(maxi,arr[i]);
            }
            
        }

        return maxi;
    }
}