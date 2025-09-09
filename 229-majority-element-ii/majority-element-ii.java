class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=hm.getOrDefault(nums[i],0);
            hm.put(nums[i],x+1);
            if(hm.get(nums[i])==((nums.length/3)+1)){
                ans.add(nums[i]);
            }
            if(ans.size()==2){break;}
        }
        return ans;
    }
}