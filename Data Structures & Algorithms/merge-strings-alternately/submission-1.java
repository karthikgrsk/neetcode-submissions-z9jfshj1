class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int l=0,r=0;
        while(l<word1.length() && r<word2.length()){
            ans+=word1.charAt(l);
            ans+=word2.charAt(r);
            l++;r++;
        }

        while(l < word1.length()){
            ans+=word1.charAt(l);
            l++;
        }

        while(r < word2.length()){
            ans+=word2.charAt(r);
            r++;
        }
        return ans;
    }
}