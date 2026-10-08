class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='(' && count++>0){
                sb.append(c);
            }
            else if(c==')' && --count>0){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}