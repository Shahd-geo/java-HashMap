import java.util.HashMap;

public class DepartmentManagerDemo {
    static void main(String[] args) {
        HashMap<String,String> DepartmentManagerDemo=new HashMap<>();
        DepartmentManagerDemo.put("Geography","Muna");
        DepartmentManagerDemo.put("Arabic","Sara");
        DepartmentManagerDemo.put("Tourism","Ahmad");
        DepartmentManagerDemo.put("English","Balal");
        DepartmentManagerDemo.put("History","Ali");
        System.out.println(DepartmentManagerDemo);
        System.out.println(DepartmentManagerDemo.get("Arabic"));
        System.out.println(DepartmentManagerDemo.containsKey("Arabic"));
        System.out.println(DepartmentManagerDemo.containsKey("Media"));
        DepartmentManagerDemo.put("Tourism","Omir");
        System.out.println(DepartmentManagerDemo);
        DepartmentManagerDemo.remove("History");
        System.out.println(DepartmentManagerDemo);
        System.out.println(DepartmentManagerDemo.size());


    }
}
