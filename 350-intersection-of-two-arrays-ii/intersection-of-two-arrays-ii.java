class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int x=nums1.length;
        int y=nums2.length;
        
        int[] ans=new int[1001];
        if(x==0||y==0){
            return new int[0];
        }
        int[]f1=freq(nums1,x);
        int[]f2=freq(nums2,y);
        for(int i=0;i<1001;i++){
            ans[i] = Math.min(f1[i], f2[i]);
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            int count = ans[i]; 
            for (int j = 0; j < count; j++) {
                resultList.add(i);
            }
        }
        int[] originalArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            originalArray[i] = resultList.get(i);
        }

        return originalArray;

        
    }
    private int[] freq(int[]x,int n){
        int[] hash=new int[1001];        
        for(int i=0;i<n;i++){
            hash[x[i]]++;
        }
        return hash;
    }
}