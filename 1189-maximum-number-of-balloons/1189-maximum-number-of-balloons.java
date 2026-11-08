class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int b=map.getOrDefault('b',0);
        int a=map.getOrDefault('a',0);
        int l=map.getOrDefault('l',0)/2;
        int o=map.getOrDefault('o',0)/2;
        int n=map.getOrDefault('n',0);
        int [] ans={b,a,l,o,n};
        int min=Integer.MAX_VALUE;
        for(int num:ans){
            min=Math.min(min,num);
        }
        return min;
    }
}