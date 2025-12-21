class Solution {
    public String largestOddNumber(String num) {
        StringBuilder x=new StringBuilder();
        for(int i =num.length()-1;i>=0;i--){
            if(x.length()>=1||Character.getNumericValue(num.charAt(i))%2!=0){
                x.append(num.charAt(i));
            }
        }
        return x.reverse().toString();
    }
}