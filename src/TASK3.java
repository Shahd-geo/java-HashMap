import java.util.HashMap;

public class TASK3 {
    static void main(String[] args) {
        HashMap<Integer,String>EmployeeCheckDemo=new HashMap<>();
        EmployeeCheckDemo.put(1,"Ahmad");
        EmployeeCheckDemo.put(2,"Hmad");
        EmployeeCheckDemo.put(3,"Noor");
        EmployeeCheckDemo.put(4,"Hoor");
        EmployeeCheckDemo.put(5,"Ahd");
        System.out.println(EmployeeCheckDemo);
        System.out.println(EmployeeCheckDemo.containsKey(5));
        System.out.println(EmployeeCheckDemo.containsValue("Noor"));


    }
}
