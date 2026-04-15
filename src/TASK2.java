import java.util.HashMap;
public class TASK2 {
    public static void main(String[] args) {
        HashMap<String, Integer> EmployeeGetDemo = new HashMap<>();
        EmployeeGetDemo.put("Ahmad", 1);
        EmployeeGetDemo.put("Hmad", 2);
        EmployeeGetDemo.put("Sara", 3);
        EmployeeGetDemo.put("Hoor", 4);
        EmployeeGetDemo.put("Noor", 5);
        System.out.println(EmployeeGetDemo);
        EmployeeGetDemo.get("Noor");
        System.out.println(EmployeeGetDemo.keySet());
        EmployeeGetDemo.containsValue(1);

    }
}