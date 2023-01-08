
class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;
        while(curr != null){
            temp = curr.next;   // 다음 노드로 이동할 주소 임시 저장
            curr.next = prev;   // 연결 방향 바꾸기
            // 다음 노드로 이동
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
