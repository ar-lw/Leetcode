class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> mapV=new HashMap<>();
        Map<Character,Integer> mapC=new HashMap<>();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                mapV.put(ch,0);
            }
            else{
                mapC.put(ch,0);
            }
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                mapV.put(ch,mapV.get(ch)+1);
            }
            else{
                mapC.put(ch,mapC.get(ch)+1);
            }
        }
        int maxV=0;
        int maxC=0;
        for(char ch:mapV.keySet()){
            if(mapV.get(ch)>maxV){
                maxV=mapV.get(ch);
            }
        }
        for(char ch:mapC.keySet()){
            if(mapC.get(ch)>maxC){
                maxC=mapC.get(ch);
            }
        }
        return maxV+maxC;

    }
}