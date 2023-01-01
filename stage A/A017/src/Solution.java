import java.util.Scanner;

public class Solution {
    public int solution() {
        int set=0;
        int[] numbers = new int[9];
        for(int i=0; i<9; i++) numbers[i] = 0;

        Scanner s = new Scanner(System.in);
        int roomN = s.nextInt();
        while(true) {
            // 일의자리 숫자 하나
            int oneDigit = roomN%10;
            // 사용할 숫자가 없는 경우
            if(numbers[oneDigit-1] == 0) {
                // 일의자리 숫자 6이고, 9를 대신 사용할 수 있는 경우
                if(oneDigit == 6 && numbers[8] > 0){
                    numbers[8]--;
                }
                // 일의자리 숫자 9이고, 6을 대신 사용할 수 있는 경우
                else if(oneDigit == 9 && numbers[5] > 0){
                    numbers[5]--;
                }
                // 새로운 set를 사야하는 경우
                else{
                    set++;
                    for(int i=0; i<9; i++) numbers[i]++;
                    numbers[oneDigit-1]--;
                }
            }
            // 사용할 숫자가 있는 경우
            else numbers[oneDigit-1]--;
            // 일의 자리 숫자 버림
            roomN = roomN/10;
            // 모든 숫자에 대해 점검이 끝남
            if(roomN == 0) break;
        }
        System.out.println(set);
        return set;
    }
}
