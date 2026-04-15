import java.util.HashMap;
import java.util.*;

public class  EmployeeKeyLoopDemo  {
    static void main(String[] args) {
        HashMap<Integer, String>  EmployeeKeyLoopDemo = new HashMap<>();
        EmployeeKeyLoopDemo .put(2, "Hmad");
        EmployeeKeyLoopDemo .put(3, "Noor");
        EmployeeKeyLoopDemo .put(4, "Hoor");
        EmployeeKeyLoopDemo .put(5, "Ahd");
        EmployeeKeyLoopDemo .put(1, "Shahd");
        System.out.println(EmployeeKeyLoopDemo );
        System.out.println(EmployeeKeyLoopDemo.keySet());
        for (Integer key : EmployeeKeyLoopDemo.keySet()) {
            System.out.println(key );
        }
        for (Map.Entry<Integer, String> x : EmployeeKeyLoopDemo.entrySet()) {
            System.out.println(x.getKey() + " -> " + x.getValue());
        }

    }
}