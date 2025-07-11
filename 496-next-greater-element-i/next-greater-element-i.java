class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> st= new Stack<>();
        Map<Integer,Integer> hm=new HashMap();
        
            // while(st.empty()==false && st.peek()){
            //     if(x==st.peek()){
            //         st.pop();
            //     }
            //     else if(st.peek()>x){
            //         x=st.pop();
            //         hm.put(x,-1);
            //     }
            //     else if(st.peek()<x){
            //         hm.put(st.peek(),x);
            //         x=st.pop();
            //     }
            // }
        for(int i= nums2.length-1;i>=0;i--){
            while(st.empty()==false && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.empty()){
                
                hm.put(nums2[i],-1);
                st.push(nums2[i]);
            }
            else{
                hm.put(nums2[i],st.peek());
                st.push(nums2[i]);
            }
            
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=hm.get(nums1[i]);
        }
        return ans;

    }
}