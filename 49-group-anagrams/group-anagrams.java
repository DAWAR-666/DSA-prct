class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {        
        int n=strs.length;
        if(n==0||strs==null){
             return new ArrayList<>();
        }
        HashMap<String,List<String>> hm=new HashMap<>();
        for (String str:strs){
            String freqstr=getfreq(str);
            if (hm.containsKey(freqstr)){
                hm.get(freqstr).add(str);
            }
            else{
                List<String> strlist=new ArrayList<>();
                strlist.add(str);
                hm.put(freqstr,strlist);
            }
        }
            return new ArrayList(hm.values());

    }
    private String getfreq(String str){
        int[] freq=new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder frstr=new StringBuilder("");
        char c='a';
        for(int i:freq){
            frstr.append(c);
            frstr.append(i);
            c++;
        }
        return frstr.toString();
    }
}