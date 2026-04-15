import java.util.HashMap;

public class EmployeeKeysValuesDemo {
    static void main(String[] args) {
        HashMap<Integer,String> EmployeeKey=new HashMap<>();
        EmployeeKey.put(2,"Hmad");
        EmployeeKey.put(3,"Noor");
        EmployeeKey.put(4,"Hoor");
        EmployeeKey.put(5,"Ahd");
        EmployeeKey.put(1,"Shahd");
        System.out.println(EmployeeKey);
        System.out.println(EmployeeKey.keySet());
        System.out.println(EmployeeKey.values());
        EmployeeKey.put(6,"Shams");
        System.out.println(EmployeeKey);

    }
}

