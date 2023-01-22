import java.util.ArrayList;
import java.util.List;

/**
 * Employee importance
 * https://leetcode.com/problems/employee-importance/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Employee> list = new ArrayList<>();
        List<Integer> subordinates = new ArrayList<>();

        subordinates.add(2);
        subordinates.add(3);
        list.add(new Employee(1, 5, subordinates));

        subordinates = new ArrayList<>();
        list.add(new Employee(2, 3, subordinates));

        subordinates = new ArrayList<>();
        list.add(new Employee(3, 3, subordinates));
        System.out.println(s.getImportance(list, 1));
    }
}