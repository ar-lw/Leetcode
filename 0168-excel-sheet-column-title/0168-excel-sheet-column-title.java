class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        int num=columnNumber;
        while(num>0){
            num--;
            int val=num%26;
            num/=26;
            sb.append((char)('A'+val));
        }
        return sb.reverse().toString();
    }
}