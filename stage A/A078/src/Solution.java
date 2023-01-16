/**
 * 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고
 * 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
 */

public class Solution {
    public int solution(int[] citations) {
        int more = 0;
        int less = 0;
        int max = -1;
        for(int h=0; h<=citations.length; h++){
            more = 0;
            less = 0;
            for(int n=0; n<citations.length; n++){
                if(citations[n] >= h) more++;
                if(citations[n] < h) less++;
            }
            if(more >= h && citations.length - more == less) max = h;
        }

        return max;
    }
}
