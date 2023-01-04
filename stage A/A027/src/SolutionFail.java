import java.util.ArrayList;
import java.util.List;
/*런타임 에러 뜸
* 예시 테스트는 통과
* Greedy 방식을 적용해야 함.
* */
public class SolutionFail {

    // 기존의 string에서 가장 작은 숫자 위치 구하기
    public int minIdx(String curr){
        int min=10, minIdx=0;
        for(int i=0; i<curr.length(); i++){
            int temp = Integer.parseInt(curr.charAt(i) +"");
            if(temp < min) {
                min = temp;
                minIdx = i;
            }
        }
        return minIdx;
    }

    // 기존의 string에서 가장 작은 숫자 빼고 뒤에 새로운 숫자 붙이기
    public String addChar(String curr, char added, int minIdx){
        String str = "";
        for(int i=0; i<curr.length(); i++){
            if(i == minIdx){
                continue;
            }
            str += curr.charAt(i);
        }
        str += added;
        return str;
    }
    public String solution(String number, int k) {
        List<Character> answer = new ArrayList<>();
        String returnStr="";
        int length = number.length()-k; // 반환할 문자열 길이
        for(int i=0; i<number.length(); i++){
            if(answer.size() == length){    // 새로운 문자 붙이면 최소 길이를 넘는 경우
                String compareStr="";

                for(int m=0; m<answer.size(); m++) compareStr += answer.get(m);
                int compareA = Integer.parseInt(compareStr);

                int minIdx = minIdx(compareStr);
                String temp = addChar(compareStr, number.charAt(i), minIdx);
                int compareB = Integer.parseInt(temp);

                // 새로운 문자를 붙이지 않은 원래의 문자열이 더 큰 경우, 변화를 주지 않는다
                if(compareA > compareB) continue;
                else {
                    answer.add(number.charAt(i));
                    answer.remove(minIdx);
                }
            }   // 새로운 문자 붙여도 상관 없는 경우
            else answer.add(number.charAt(i));
        }
        for(int m=0; m<answer.size(); m++) returnStr += answer.get(m);
        return returnStr;
    }
}
