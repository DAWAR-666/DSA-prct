class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> st=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int thrd=-(nums[i]+nums[j]);
                if(st.contains(thrd)){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],thrd);
                        
                        temp.sort(null);
                        set.add(temp);
                    }
                    st.add(nums[j]);
                
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
}