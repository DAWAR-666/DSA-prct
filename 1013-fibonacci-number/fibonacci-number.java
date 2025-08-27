class Solution {
    public int fib(int n) {
        if (n==0 || n==1){
            return n;
        }
        return fibs(n-1)+fibs(n-2);
    }
    public int fibs(int x){
        if (x==0 || x==1){
            return x;
        }
        return fibs(x-1)+fibs(x-2);
    }
}