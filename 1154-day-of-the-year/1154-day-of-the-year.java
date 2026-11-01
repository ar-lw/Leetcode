class Solution {
    public int dayOfYear(String date) {
        int[] months={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans=0;
        String month=date.substring(5,7);
        int m=Integer.parseInt(month);
        String days=date.substring(8,10);
        int d=Integer.parseInt(days);
        for(int i=1;i<m;i++){
            ans+=months[i-1];
        }
        ans=ans+d;
        String year=date.substring(0,4);
        int y=Integer.parseInt(year);
        if(((y%4==0 && y%100!=0) || (y%400==0))&&(m>2)){
            return ans+1;
        }
        return ans;

    }
}