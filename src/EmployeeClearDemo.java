import java.util.HashMap;

public class EmployeeClearDemo {
    static void main(String[] args) {
        HashMap<Integer,String>Employee = new HashMap<>();
        Employee.put(2,"Hmad");
        Employee.put(3,"Noor");
        Employee.put(4,"Hoor");
        Employee.put(5,"Ahd");
        Employee.put(1,"Shahd");
        System.out.println(Employee);
        System.out.println(Employee.size());
        Employee.clear();
        System.out.println(Employee);
        System.out.println(Employee.size());
    }
}
