import java.util.HashMap;

public class CourseTrainerDemo {
    static void main(String[] args) {
        HashMap<String,String> CourseTrainerDemo =new HashMap<>();
        CourseTrainerDemo.put("Arabic","Ahmad");
        CourseTrainerDemo.put("Art","Ali");
        CourseTrainerDemo.put("Geography","Hmad");
        CourseTrainerDemo.put("English","Amad");
        System.out.println(CourseTrainerDemo);
        System.out.println(CourseTrainerDemo.get("Art"));
        System.out.println(CourseTrainerDemo.containsKey("Arabic"));
        System.out.println(CourseTrainerDemo.containsKey("GIS"));
        CourseTrainerDemo.remove("Art");
        System.out.println(CourseTrainerDemo);
        System.out.println(CourseTrainerDemo.size());



    }
}
