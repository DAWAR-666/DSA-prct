class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int area=0;
        while(low<high){
            int l=high-low;
            int b=Math.min(height[low],height[high]);
            int temp=l*b;
            area=Math.max(temp,area);
            if(height[low]<height[high])low++;
            else high--;
        }
        return area;
    }
}