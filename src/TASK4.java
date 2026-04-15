import java.util.HashMap;

public class TASK4 {
    static void main(String[] args) {
        HashMap<Integer,String> EmployeeRemoveDemo=new HashMap<>();
        EmployeeRemoveDemo.put(2,"Hmad");
        EmployeeRemoveDemo.put(3,"Noor");
        EmployeeRemoveDemo.put(4,"Hoor");
        EmployeeRemoveDemo.put(5,"Ahd");
        EmployeeRemoveDemo.put(1,"Shahd");
        System.out.println(EmployeeRemoveDemo);
        EmployeeRemoveDemo.remove(2);
        System.out.println(EmployeeRemoveDemo);
        EmployeeRemoveDemo.remove(5);
        System.out.println(EmployeeRemoveDemo);


    }
}
