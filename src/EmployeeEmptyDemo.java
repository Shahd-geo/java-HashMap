import java.util.HashMap;

public class EmployeeEmptyDemo {
    static void main(String[] args) {
        HashMap<Integer, String> EmployeeEmpty = new HashMap<>();
        System.out.println(EmployeeEmpty.isEmpty());
        EmployeeEmpty.put(2, "Hmad");
        EmployeeEmpty.put(3, "Noor");
        EmployeeEmpty.put(4, "Hoor");
        EmployeeEmpty.put(5, "Ahd");
        EmployeeEmpty.put(1, "Shahd");
        System.out.println(EmployeeEmpty);
        System.out.println(EmployeeEmpty.isEmpty());
        EmployeeEmpty.clear();
        System.out.println(EmployeeEmpty);
        System.out.println(EmployeeEmpty.isEmpty());


    }
}
