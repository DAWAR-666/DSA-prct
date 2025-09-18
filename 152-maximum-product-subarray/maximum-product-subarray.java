class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int x=1;
            for(int j=i;j<nums.length;j++){
                
                
                    x*=nums[j];
                    max=Math.max(max,x);
                
            }
        }
        return max;
    }
}