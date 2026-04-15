import java.util.HashMap;

public class EmployeeMapDemo19 {
    static void main(String[] args) {
        HashMap<Integer,String> EmployeeMapDemo19  =new HashMap<>();
        EmployeeMapDemo19 .put(12,"Ahmad");
        EmployeeMapDemo19.put(89,"Ali");
        EmployeeMapDemo19.put(99,"Hmad");
        EmployeeMapDemo19.put(32,"Amad");
        System.out.println( EmployeeMapDemo19);
        System.out.println( EmployeeMapDemo19.get(12));
        System.out.println( EmployeeMapDemo19.containsKey(89));
        EmployeeMapDemo19.put(32,"Shahd");
        System.out.println( EmployeeMapDemo19);
        EmployeeMapDemo19.remove(99);
        System.out.println( EmployeeMapDemo19);
        System.out.println( EmployeeMapDemo19.size());



    }
}
