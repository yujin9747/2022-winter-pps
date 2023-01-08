public class Solution {
    int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] dayOfWeek = {"THU","FRI","SAT", "SUN", "MON","TUE","WED"}; // 1월 1일이 금요일 이므로 7로 나눈 나머지를 기준으로 정리함
    public String solution(int a, int b) {
        int d=0;    // 2016년에 되고 흐른 날을 모두 더한다
        for(int i=0; i<a-1; i++){
            d += days[i];
        }
        d += b;
        return dayOfWeek[d%7];  // 7로 나눈 나머지로 요일을 알아낸다.
    }
}
