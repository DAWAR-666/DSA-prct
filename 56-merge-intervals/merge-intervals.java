class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        temp.add(intervals[0][0]);
        temp.add(intervals[0][1]);
        for(int i=1;i<intervals.length;){
            int x=temp.get(temp.size() - 1);
            if(x>=intervals[i][0]){
                if(x>=intervals[i][1]){
                    i++;
                }
                else{
                    temp.remove(temp.size()-1);
                    temp.add(intervals[i][1]);
                    i++;}
            }
            else if(x<intervals[i][0]){
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                i++;
            }
        }
        int[][] ans=new int[temp.size()/2][2];
        int j=0;
        for(int i=0;i<ans.length;i++){
            ans[i][0]=temp.get(j);
            j++;
            ans[i][1]=temp.get(j);
            j++;
        }
        return ans;
    }
}