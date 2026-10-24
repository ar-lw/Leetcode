class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] monthW={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayAA=0;
        int dayAL=0;
        int dayBA=0;
        int dayBL=0;
        int days=0;
        int monthAliceA=Integer.parseInt(arriveAlice,0,2,10);
        int dayAliceA=Integer.parseInt(arriveAlice,3,5,10);
        int monthAliceL=Integer.parseInt(leaveAlice,0,2,10);
        int dayAliceL=Integer.parseInt(leaveAlice,3,5,10);
        int monthBobA=Integer.parseInt(arriveBob,0,2,10);
        int dayBobA=Integer.parseInt(arriveBob,3,5,10);
        int monthBobL=Integer.parseInt(leaveBob,0,2,10);
        int dayBobL=Integer.parseInt(leaveBob,3,5,10);
        for(int i=1;i<monthAliceA;i++){
            for(int j=0;j<monthW[i-1];j++){
                dayAA++;
            }
        }
        dayAA+=dayAliceA;
        for(int i=1;i<monthAliceL;i++){
            for(int j=0;j<monthW[i-1];j++){
                dayAL++;
            }
        }
        dayAL+=dayAliceL;
        for(int i=1;i<monthBobA;i++){
            for(int j=0;j<monthW[i-1];j++){
                dayBA++;
            }
        }
        dayBA+=dayBobA;
        for(int i=1;i<monthBobL;i++){
            for(int j=0;j<monthW[i-1];j++){
                dayBL++;
            }
        }
        dayBL+=dayBobL;
        int start=Math.max(dayAA,dayBA);
        int end=Math.min(dayAL,dayBL);
        days=end - start+1;

        // for(int i=1;i<=12;i++){
        //     for(int j=0;j<monthW[i-1];j++){
        //         boolean conditionA=(i==monthAliceA && i==monthAliceL)&&(j>=dayAliceA && j<=dayAliceL);
        //         boolean conditionB=(i==monthBobA && i==monthBobL)&&(j>=dayBobA && j<=dayBobL);
        //         boolean diffm=(i>=monthAliceA && i<=monthAliceL)&&(i>=monthBobA && i<=monthBobL)&&();
        //         if(conditionA && conditionB){
        //             days++;
        //         }
        //         else if(diffm){
        //             days++;
        //         }
        //     }
        // }
        return (days>0)?days:0;
    }
}