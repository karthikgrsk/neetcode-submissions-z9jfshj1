class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int b=0,w=0;
            for(int j=i;j<n;j++){
                if(blocks.charAt(j) == 'W') w++;
                else b++;

                if(w+b == k){
                    min = Math.min(w,min);
                }
            }
        }

        return min;
    }
}