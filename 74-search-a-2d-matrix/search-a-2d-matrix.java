class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int low=0;
        int high=r-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] == target) return true;
            if (matrix[mid][0] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(high<0)return false;
        int cl=0;
        int ch=c-1;
        while(cl<=ch){
            int mid=(cl+ch)/2;
            if(matrix[high][mid]==target)return true;
            else if(matrix[high][mid]>target) ch=mid-1;
            else if(matrix[high][mid]<target) cl=mid+1;
        }
        return false;
    }
}