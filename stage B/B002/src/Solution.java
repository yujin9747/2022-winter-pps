import java.util.List;

public class Solution {
    List<Employee> employees;
    public int getImportance(List<Employee> employees, int id) {
        this.employees = employees;
        Employee employee = getEmployee(id);
        return recursive(employee);
    }

    public int recursive(Employee emp){
        if(emp.subordinates.size() == 0) return emp.importance;
        int sum=0;
        Employee employee;
        for(int i=0; i<emp.subordinates.size(); i++){
            employee = getEmployee(emp.subordinates.get(i));
            sum += recursive(employee);
        }
        sum += emp.importance;
        return sum;
    }

    public Employee getEmployee(int id){
        int i;
        for(i=0; i<employees.size(); i++){
            if(employees.get(i).id == id) break;
        }
        return employees.get(i);
    }
}
