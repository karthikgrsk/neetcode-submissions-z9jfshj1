class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> se = new HashSet<>();

        for(int i : nums){
            se.add(i);
        }

        int mLen = 0;
        for(int i : nums){
            if(!se.contains(i-1)){
                 int start = i;
                 int len = 0;
                 while(se.contains(start)){
                    len++;
                    start += 1;
                 }
                 mLen = Math.max(mLen,len);
            }
           
        }

        return mLen;
    }
}
