class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0;
        int l  = 0 , r = heights.length-1;
        while(l < r ){
            int min = Math.min(heights[l],heights[r]);
            System.out.println("min:"+ min );
            int area = min * (r-l);
            System.out.println("area:"+area);
            if(heights[l] <= heights[r]){
                l++;
            }else{
                r--;
            }

            maxarea = Math.max(maxarea,area);
        }

        return maxarea;
    }
}
