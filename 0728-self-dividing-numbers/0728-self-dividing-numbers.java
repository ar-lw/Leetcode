class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            boolean flag=true;
            while(num>0){
                int d=num%10;
                num/=10;
                if(d==0){
                    flag=false;
                    break;
                }
                if(i%d!=0){
                    flag=false;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}