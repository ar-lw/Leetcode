class Solution {
    public int maxDepth(String s) {
        int nest=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                nest++;
            }
            else if(c==')'){
                nest--;
            }
            max=Math.max(nest,max);
        }
        return max;
    }
}