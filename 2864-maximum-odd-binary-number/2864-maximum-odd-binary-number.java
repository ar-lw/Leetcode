class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] chArr=s.toCharArray();
        int n=chArr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(chArr[i]=='1'){
                count++;
            }
        }
        count--;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<(n-1);i++){
            if(count>0){
                sb.append('1');
                count--;
            }
            else{
                sb.append('0');
            }
        }
        
        sb.append('1');
        return sb.toString();

    }
}