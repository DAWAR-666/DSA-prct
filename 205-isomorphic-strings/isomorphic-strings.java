class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> x=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(x.containsKey(s.charAt(i)) ){
                if(t.charAt(i)!=x.get(s.charAt(i))){
                    return false;
                } 
            }
            else{
                if(x.containsValue(t.charAt(i))) return false;
            }
            x.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}