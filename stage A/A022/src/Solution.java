import java.util.Scanner;

public class Solution {
    // period 요금이 부과되는 시간 간격
    // price 시간 간격 마다 추가되는 요금
    // time 통화 시간
    public int payment(int time, int period, int price){
        int result=0;
        while(true) {
            result += price;
            time -= period;
            if(time < 0) break;
        }
        return result;
    }
    public void solution() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();    // 휴대폰 사용 시간 데이터 개수
        int minsik = 0;
        int youngsik = 0;
        int time;
        for(int i=0; i<n; i++){
            time = s.nextInt();
            minsik += payment(time, 60, 15);
            youngsik += payment(time, 30, 10);
        }
        if(minsik == youngsik) System.out.println("Y M " + minsik);
        else if(minsik > youngsik) System.out.println("Y " + youngsik);
        else System.out.println("M " + minsik);
    }
}
