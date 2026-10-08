class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            sb.append(c);
            if(c=='(') count++;
            else if(c==')') count--;
            if(count==0){
                sb.deleteCharAt(sb.length()-1);
                sb.deleteCharAt(0);
                res.append(sb.toString());
                sb.setLength(0);
            }
        }
        return res.toString();
    }
}