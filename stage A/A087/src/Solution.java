import java.util.*;

/**
 * 한 박스 당 unit이 가장 큰 것부터 사용해서 박스를 실어야 한다.
 * unit이 같은건 굳이 나눠져 있을 필요 없으니까 박스 수를 합칠까? 그러면 맵을 써도 상관이 없을 것 같은데.
 * unit이 같은 것은 묶어서 map에 총 박스 수를 저장후 사용함.
 * */
public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] unitArray = new int[boxTypes.length];
        int maximumUnits=0, length = boxTypes.length;
        int k=0; // unitArray 인덱스
        // 2차원 배열을 map으로 변환 & units of ith box type을 1차원 배열로 만들기
        for(int i=0; i< boxTypes.length;i++){
            // unit의 갯수가 중복되는 경우, 박스의 수를 합친다.
            if(map.containsKey(boxTypes[i][1]) == true){
                int temp = map.get(boxTypes[i][1]);
                map.replace(boxTypes[i][1], map.get(boxTypes[i][1]).intValue() + boxTypes[i][0]);
                length--;
            }
            else {
                map.put(boxTypes[i][1], boxTypes[i][0]);
                unitArray[k] = boxTypes[i][1];
                k++;
            }
        }

        // 정렬
        Arrays.sort(unitArray);

        // unit의 개수가 큰 순서대로 박스를 트럭에 싣는다.
        for(int i= boxTypes.length-1; i>=0; i--){
            if(unitArray[i] == 0) break;   // 트럭 공간은 남았으나, 모든 박스를 실은 경우 여기서 종료
            if(truckSize > map.get(unitArray[i])){
                truckSize -= map.get(unitArray[i]);
                maximumUnits += map.get(unitArray[i]) * unitArray[i];
            }
            else{   // 트럭 공간을 최대한 다 채우고, 남은 박스가 있는 경우 여기서 종료
                maximumUnits += unitArray[i] * truckSize;
                truckSize = 0;
                break;
            }
        }

        return maximumUnits;
    }
}
