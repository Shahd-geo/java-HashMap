import java.util.HashMap;

public class EmployeeSizeDemo {
    static void main(String[] args) {
        HashMap<Integer,String>EmployeeSizeDemo=new HashMap<>();
        EmployeeSizeDemo.put(2,"Hmad");
        EmployeeSizeDemo.put(3,"Noor");
        EmployeeSizeDemo.put(4,"Hoor");
        EmployeeSizeDemo.put(5,"Ahd");
        EmployeeSizeDemo.put(1,"Shahd");
        System.out.println(EmployeeSizeDemo);
        System.out.println(EmployeeSizeDemo.size());
        EmployeeSizeDemo.put(6,"Shams");
        System.out.println(EmployeeSizeDemo);
        System.out.println(EmployeeSizeDemo.size());

    }
}
