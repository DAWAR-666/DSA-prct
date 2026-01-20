class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0;
        int low=weights[0];
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
            if(weights[i]>low) low=weights[i];
        }
    
        while(low<=high){
            int mid=low+(high-low)/2;
            int x=1;
            int sum=0;
            for (int w : weights) {
                if (sum + w > mid) {
                    x++;   
                    sum = w;
                } else {
                    sum += w;
                }
            }
            if(x<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
}