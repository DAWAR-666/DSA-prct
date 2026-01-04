class Solution {
    public String frequencySort(String s) {
        String ans="";
        Map<Character,Integer> x=new HashMap<>();
        for(int i=0;i<s.length();i++){
            x.merge(s.charAt(i), 1, Integer::sum);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> x.get(b) - x.get(a));
        maxHeap.addAll(x.keySet());
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            int freq = x.get(current);
            for (int i = 0; i < freq; i++) {
                ans+=current;
            }
        }
        return ans;
    }
}