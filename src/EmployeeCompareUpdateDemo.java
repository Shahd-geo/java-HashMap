import java.util.HashMap;

public class EmployeeCompareUpdateDemo {
    static void main(String[] args) {
        HashMap<Integer, String> EmployeeCompareUpdat = new HashMap<>();
        EmployeeCompareUpdat.put(2, "Hmad");
        EmployeeCompareUpdat.put(3, "Noor");
        EmployeeCompareUpdat.put(4, "Hoor");
        EmployeeCompareUpdat.put(5, "Ahd");
        EmployeeCompareUpdat.put(1, "Shahd");
        System.out.println(EmployeeCompareUpdat);
        System.out.println(EmployeeCompareUpdat.get(3));
        EmployeeCompareUpdat.put(1, "Shams");
        System.out.println(EmployeeCompareUpdat.get(1));
        System.out.println(EmployeeCompareUpdat);


    }
}
