class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] hash=new int[n];
        int x=-1;
        //dawar
        for(int i=0;i<n;i++){
            
            hash[nums[i]]++;
        
        }
        for(int i=0;i<n;i++){
            if (hash[i]>=2){
                x=i;
                break;
            }
        
        }
        
        return x;
    }
}