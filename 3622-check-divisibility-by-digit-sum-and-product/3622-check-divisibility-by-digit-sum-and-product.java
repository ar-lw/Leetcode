class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int prod=1;
        while(num>0){
            int d=num%10;
            sum+=d;
            prod*=d;
            num/=10;
        }
        num=sum+prod;
        return n%num==0;

    }
}