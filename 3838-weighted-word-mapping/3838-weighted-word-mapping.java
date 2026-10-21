class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        int sum;
        for(String word:words){
            sum=0;
            for(int i=0;i<word.length();i++){
                sum+=weights[word.charAt(i)-'a'];
            }
            sum=sum%26;
            sb.append((char)(97+25-sum));
        }
        return sb.toString();
        }

    }