class Solution {
    public int max(int[][]mat,int col){
        int index=-1;
        int value=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>value){
                value=mat[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        if(mat.length==1 && mat[0].length ==1)return new int[]{0,0};
        int row=mat.length;
        int col=mat[0].length;
        int low=0;
        int high=mat[0].length;
        while(low<=high){
            int mid=low+(high-low)/2;
            int max=max(mat,mid);
            int right=mid+1<col?mat[max][mid+1]:-1;
            int left=mid-1>=0?mat[max][mid-1]:-1;
            if(mat[max][mid]>left && mat[max][mid]>right){
                return new int[] {max,mid};
            }
            else if(mat[max][mid]>left && mat[max][mid]<right){
                low=mid+1;
            }
            else{high=mid-1;}
        }
        return new int[] {-1,-1};
    }
}