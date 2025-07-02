class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Arrays.sort(nums);
        int n=nums.length;
        int x=1;
        int y=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                y++;
            }
            else{y=1;}
            x=Math.max(x,y);
        }
        return x;
       

    }
}