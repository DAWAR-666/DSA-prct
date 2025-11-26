class Solution {
    public int find(int[]nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int m=(low+high)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]<target){
                low=m+1;
            }
            else if(nums[m]>target){
                high=m-1;
            }
        }
        return -1;
    }
    public int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = mid;     // Potential floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Function to find ceiling
    public int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;     // Potential ceil
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public int[] searchRange(int[] nums, int target) {
        int s=find(nums,target);
        if(s==-1){
            return new int[]{-1,-1};
        }
        int f = findFloor(nums, target);
        int c = findCeil(nums, target);
        return new int[]{c, f};
    }
}