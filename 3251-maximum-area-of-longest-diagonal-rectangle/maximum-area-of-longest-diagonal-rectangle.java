class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area=0;
        double dgn=0;
        for(int i=0;i<dimensions.length;i++){
            int x=dimensions[i][0]*dimensions[i][1];
            double y=Math.sqrt((dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]));
            if(y>dgn){
                area=x;
                dgn=y;
            }else if(y==dgn && x>area){
                area=x;
            }
        }
        return area;
    }
}