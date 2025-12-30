class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k) return -1;
        int max=bloomDay[0];
        int min=bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>=max){
                max=bloomDay[i];
            }
            if(bloomDay[i]<=min){
                min=bloomDay[i];
            }
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int x=0;
            int y=0;
            for(int i=0;i<bloomDay.length;i++){
                
                if(bloomDay[i]<=mid ){
                    y++;
                }
                
                else{
                    x+=(y/k);
                    y=0;
                }
            }
            x+=(y/k);
            if(x>=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}