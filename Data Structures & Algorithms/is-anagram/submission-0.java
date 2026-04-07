class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mpp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            if(mpp.containsKey(ch2)){
                mpp.put(ch2,mpp.get(ch2)-1);
            }else{
                return false;
            }
        }

        for(int cnt:mpp.values()){
            if(cnt !=0 ){
                return false;
            }
        }
        return true;
    }
}
