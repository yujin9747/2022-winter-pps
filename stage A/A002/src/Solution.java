import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        // i : row
        for(int i=0; i<numRows; i++){
            List<Integer> l = new ArrayList<>();
            // j : 각 row의 숫자 공간
            for(int j=0; j<i+1; j++){               // 1, 3, 5, 7 ... 2개씩 칸 증가함
                if(j == 0 || j == i) l.add(1);      // 양끝 1 배치
                else l.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));      // list.get(i-1) : 윗 라인 리스트 . get(j-1) : 왼쪽 값 , get(j) : 오른쪽 값
            }
            list.add(l);                            // 완성된 row를 전체 list에 추가
        }
        return list;
    }
}
