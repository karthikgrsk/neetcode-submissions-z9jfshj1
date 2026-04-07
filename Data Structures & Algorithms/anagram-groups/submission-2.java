class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ls=new ArrayList<List<String>>();

        Map<String,List<String>> mpp = new HashMap<>();

        for(String s:strs){

            int[] freq = new int[26];

            for(int i=0;i<s.length();i++){
               freq[s.charAt(i) - 'a']++;
            }
         
            String hash = "";
            for(int i=0;i<26;i++){
               if(freq[i] != 0){
                  hash += (char)(i + 'a');
                  hash += freq[i];
                  hash += "#";
               }
            }

            System.out.println(hash);
            if(!mpp.containsKey(hash)){
                mpp.put(hash,new ArrayList<>());
            }

            mpp.get(hash).add(s);
        }
       
        return new ArrayList<>(mpp.values());

    }
}
