class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
         int i=0,j=0;
         int m=abbr.length(),n=word.length();
         while(i < n && j < m){

                if(abbr.charAt(j) == '0'){
                    return false;
                }

            if(abbr.charAt(j) >= 'a' && abbr.charAt(j) <= 'z'){
            if(i < n && word.charAt(i) == abbr.charAt(j)){
                i++;
                j++;
            }else{
                return false;
            }
           
            }else{
                int d=0;
                while(j < m  && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9'){
                      d=d*10+(abbr.charAt(j) - '0');
                      j++;
                }
                i+=d;
            }
       }
       return i == n && j == m;
    }
    
}