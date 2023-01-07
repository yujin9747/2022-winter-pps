/**
 * nums1을 순회한다.
 * nums2에서 nums1(i)의 요소와 같은 것의 위치를 찾는다(j)
 * 해당 위치의 오른쪽을 순회한다. [j+1 ~ nums2.length()-1]
 * 더 큰 숫자를 찾으면 해당 숫자를 result의 i위치에 넣는다.
 * 더 큰 숫자를 찾지 못했다면 -1을 넣는다.
 * **/
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]) {
                    result[i] = findNextGreater(nums2, j+1);
                }
            }
        }

        return result;
    }

    public int findNextGreater(int[] nums2, int nextIdx){
        for(int j=nextIdx; j<nums2.length; j++){
            if(nums2[j] > nums2[nextIdx-1]) return nums2[j];
        }
        return -1;
    }
}
