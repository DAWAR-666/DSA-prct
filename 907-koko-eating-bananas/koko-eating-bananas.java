class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int x=piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]>=x){
                x=piles[i];
            }
        }
        int low=1;
        int high=x;
        while(low<=high){
            int mid=(low+high)/2;
            long totalh=0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]%mid==0){
                    totalh+=piles[i]/mid;
                }
                else{
                totalh+=((piles[i]/mid)+1);}
            }
            if(totalh<=h){
                high=mid-1;
            }
            
            else{
                low=mid+1;
            }
        }
        return low;
    }
}