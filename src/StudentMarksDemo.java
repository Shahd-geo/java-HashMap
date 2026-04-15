import java.util.HashMap;

public class StudentMarksDemo {
    static void main(String[] args) {
        HashMap<Integer, Integer> StudentMarksDemo = new HashMap<>();
        StudentMarksDemo .put(2, 90);
        StudentMarksDemo .put(3, 80);
        StudentMarksDemo .put(4, 70);
        StudentMarksDemo .put(5, 60);
        StudentMarksDemo .put(1, 77);
        System.out.println(StudentMarksDemo);
        StudentMarksDemo.get(77);
        System.out.println(StudentMarksDemo.containsKey(3));
        StudentMarksDemo.put(2,99);
        System.out.println(StudentMarksDemo);
        StudentMarksDemo.remove(5,60);
        System.out.println(StudentMarksDemo);
        System.out.println(StudentMarksDemo.size());

    }
}
