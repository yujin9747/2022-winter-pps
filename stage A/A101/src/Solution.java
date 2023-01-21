import java.util.Arrays;
import java.util.Collections;

/**
 * 두 사람 각각이 가지고 있는 캔디의 총 개수를 구한다.
 * 둘의 차이를 구한다.
 * 둘의 차이의 반을 구한다.
 * 둘의 차이의 반을 gap으로 가지는 숫자 하나씩을 골라 교환하면 된다.
 * 둘은 처음에 서로다른 개수의 캔디를 가지고 있다고 가정한다.
 * 교환해서 개수가 같아지는 경우가 존재한다고 가정한다.
 * **/
public class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum=0;
        int bobSum=0;

        // 합을 구한다
        for(int i=0; i<aliceSizes.length; i++) aliceSum += aliceSizes[i];
        for(int i=0; i<bobSizes.length; i++) bobSum += bobSizes[i];

        int flag=0; // alice가 더 많이 가진 경우 0, bob이 더 많이 가진 경우 1;
        int gap=0;

        // 더 많이 가진 사람을 구한다
        if(aliceSum < bobSum) {
            flag=1;
            gap = bobSum - aliceSum;
        }
        else gap = aliceSum - bobSum;

        // 수를 맞추기 위해 교환해야하는 캔디 끼리의 gap을 구한다
        int exchangeGap = gap/2;

        // sorting을 하기 위해 Integer타입의 배열로 변환한다
        Integer[] aliceCandies = new Integer[aliceSizes.length];
        for(int i=0; i<aliceSizes.length; i++) aliceCandies[i] = aliceSizes[i];
        Integer[] bobCandies = new Integer[bobSizes.length];
        for(int i=0; i<bobSizes.length; i++) bobCandies[i] = bobSizes[i];

        // 더 큰 것은 역순으로, 더 적은 것은 오름차순으로 정렬한다.
        if(flag == 0){
            Arrays.sort(aliceCandies, Collections.reverseOrder());
            Arrays.sort(bobCandies);
        }
        else{
            Arrays.sort(aliceCandies);
            Arrays.sort(bobCandies, Collections.reverseOrder());
        }

        // 교환할 캔디를 고른다.
        int[] result = new int[2];
        int i=0;
        while(true){
            // 둘 중 더 적은 박스 개수를 모두 검사했을 경우 -> 최소 하나의 조합은 있다고 가정하기 때문에, 테스트에서 여기에 걸리는 일은 없다.
            if(i == bobCandies.length || i == aliceCandies.length) break;
            // alice가 더 많이 가진 경우
            if(flag == 0){
                // alice의 i번째 박스의 캔디와 교환할 수 있는 bob의 캔디 박스가 있는지 검사한다.
                for(int j=0; j<bobCandies.length; j++) {
                    // alice가 더 많이 가졌으므로, 교환하는 캔디의 개수는 alice가 더 커야한다.
                    if (aliceCandies[i] > bobCandies[j] && (aliceCandies[i] - bobCandies[j]) == exchangeGap) {
                        result[0] = aliceCandies[i];
                        result[1] = bobCandies[j];
                        return result;
                    }
                }
            }
            else{
                for(int j=0; j<aliceCandies.length; j++) {
                    if (bobCandies[i] > aliceCandies[j] && (bobCandies[i] - aliceCandies[j]) == exchangeGap) {
                        result[1] = bobCandies[i];
                        result[0] = aliceCandies[j];
                        return result;
                    }
                }
            }

            i++;
        }

        return result;
    }
}
