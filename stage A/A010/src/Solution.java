import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 문자열을 자르는 단위
 * 1개, 2개, 3개, ... s.length() / 2 개
 * **/
public class Solution {
    public int solution(String s) {
        List<Integer> lengths = new ArrayList<>();

        // i : 문자열을 자르는 단위
        for(int i=1; i <= s.length()/2; i++){
            lengths.add(compress(i, s));
        }

        // 오름차순 정렬
        Collections.sort(lengths);

        return lengths.get(0);
    }

    // 압축한 결과, 그 길이를 반환함
    public int compress(int i, String s) {
        String substr;
        String repeatedStr = "";
        int repeatedCount = 0;
        int compressedLength  = 0;
        for(int j=0; j<=s.length(); j += i){
            if(j+i > s.length()) {
                compressedLength += s.length()-j+i;
                if(repeatedCount > 1) compressedLength++;
                break;
            }
            substr = s.substring(j, j+i);
            if(repeatedStr.equals(substr)) {
                repeatedCount++;
            } else {
                repeatedStr = substr;
                if(repeatedCount != 0) {
                    compressedLength += i;
                    if(repeatedCount != 1) {
                        compressedLength++;
                        repeatedCount=1;
                    }
                }
                else repeatedCount=1;
            }
        }
        return compressedLength;
    }

}
