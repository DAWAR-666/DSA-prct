class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        int x=-1;
        for(int i=0;i<n;i++){
            if (set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        
        }        
        return x;
    }
}