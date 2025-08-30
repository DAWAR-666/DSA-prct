class Solution {
    public boolean check(int[] nums) {
        int x=0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]>nums[i+1]){
                x++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            x++;
        }
        return x<=1;
    }
}