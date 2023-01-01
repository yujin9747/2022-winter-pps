import java.util.Scanner;

public class Solution {
    public void solution() {
        Scanner s = new Scanner(System.in);
        int result=1;

        // 0-9까지의 각각의 digit의 개수 초기화
        int[] digit = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // 숫자 3개 입력
        for(int i=0; i<3; i++){
            result *= s.nextInt();
        }

        // 각 자리수 마다 검사 해서 개수 합산
        while(true) {
            digit[result%10]++;
            result /= 10;
            if(result == 0) break;
        }

        // 각 digit의 개수 출력
        for(int i=0; i<10; i++){
            System.out.println(digit[i]);
        }

    }
}
