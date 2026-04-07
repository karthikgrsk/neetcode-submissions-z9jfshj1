class Solution {
    public int maxArea(int[] heights) {
        int max =-1;
        int n = heights.length;
        int l=0,r= n-1;

        while(l<r){
            int w = r-l;

            int area = w * (Math.min(heights[l],heights[r]));

            max = Math.max(area,max);

            if( heights[l] < heights[r]) l++;
            else r--;
        }

        return max;
    }
}
