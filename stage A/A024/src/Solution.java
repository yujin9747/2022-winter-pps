public class Solution {
    public int[] eachChange(int bill, int[] have){
        int change = bill-5;    // 거슬러줘야 하는 돈
        while(change != 0) {
            if(change >= 20 && have[2] > 0) {
                have[2]--;
                change-=20;
            }
            else if(change >= 10 && have[1] > 0) {
                have[1]--;
                change-=10;
            } // 5달러를 사용할 때는 지폐가 존재하는지 확인하지 않는다 -> 지폐가 부족하면 음수가 되도록
            else if(change >= 5) {
                have[0]--;
                change-=5;
            }
        }
        return have;    // 사용하고 남은 지폐의 결과를 리턴
    }
    public boolean lemonadeChange(int[] bills) {
        int[] have = {0, 0, 0};  // 5, 10, 20 달러 순으로 현재 가지고 있는 현금 수
        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5) have[0]++;
            else if(bills[i] == 10) have[1]++;
            else have[2]++;
            have = eachChange(bills[i], have);
            if(have[0] < 0) return false;
        }
        return true;
    }
}
