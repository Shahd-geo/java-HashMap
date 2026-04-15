import java.util.HashMap;

public class EmployeeUpdateDemo {
    static void main(String[] args) {
        HashMap<Integer,String>EmployeeUpdateDemo=new HashMap<>();
        EmployeeUpdateDemo.put(2,"Hmad");
        EmployeeUpdateDemo.put(3,"Noor");
        EmployeeUpdateDemo.put(4,"Hoor");
        EmployeeUpdateDemo.put(5,"Ahd");
        EmployeeUpdateDemo.put(1,"Shahd");
        System.out.println(EmployeeUpdateDemo);
        EmployeeUpdateDemo.replace(5,"Qabas");
        System.out.println(EmployeeUpdateDemo.keySet());
        System.out.println(EmployeeUpdateDemo.values());
    }
}
