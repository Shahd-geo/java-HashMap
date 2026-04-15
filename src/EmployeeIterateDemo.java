import java.security.Key;
import java.util.HashMap;
import java.util.*;

public class EmployeeIterateDemo {
    static void main(String[] args) {
        HashMap<Integer, String> EmployeeIterateDemo = new HashMap<>();
        EmployeeIterateDemo.put(2, "Hmad");
        EmployeeIterateDemo.put(3, "Noor");
        EmployeeIterateDemo.put(4, "Hoor");
        EmployeeIterateDemo.put(5, "Ahd");
        EmployeeIterateDemo.put(1, "Shahd");
        System.out.println(EmployeeIterateDemo);
        for (Map.Entry<Integer, String> x : EmployeeIterateDemo.entrySet()) {
            System.out.println(x.getKey() + " -> " + x.getValue());
        }

        for (Integer key : EmployeeIterateDemo.keySet()) {
            System.out.println(  key);
        }

        for (String val : EmployeeIterateDemo.values()) {
            System.out.println(val);
        }

        EmployeeIterateDemo.size();       // Number of key-value pairs
        EmployeeIterateDemo.isEmpty();
    }
}
