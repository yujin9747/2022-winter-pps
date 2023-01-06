/**
 * Student Attendance Record 1
 * https://leetcode.com/problems/student-attendance-record-i/
 *
 * P : present
 * A : Absent
 * L : Late
 *
 * attendance award를 받을 수 있는지 true/false 반환
 * 아래는 조건입니다.
 * The student was absent ('A') for strictly fewer than 2 days total.
 * The student was never late ('L') for 3 or more consecutive days.
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkRecord("PPALLL"));
    }
}