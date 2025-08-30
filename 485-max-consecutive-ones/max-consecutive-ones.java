class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(cnt>=ans){
                    cnt++;
                    ans++;
                }
                else{
                    cnt++;
                }
            }
            else{
                cnt=0;
            }
        }
        return ans;
    }
}