class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] p=new int[nums.length/2];
        int[] n=new int[nums.length/2];
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                p[a]=nums[i];
                a++;
            }
            else{
                n[b]=nums[i];
                b++;
            }
        }
        a=0;
        b=0;
        for(int i=0;i<nums.length;){
            nums[i]=p[a];
            nums[i+1]=n[b];
            a++;b++;
            i=i+2;
        }    
        return nums;
    }
}