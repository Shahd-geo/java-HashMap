import java.util.HashMap;

public class MovieDirectorDemo {
    static void main(String[] args) {
        HashMap<String,String> MovieDirectorDemo =new HashMap<>();
        MovieDirectorDemo.put("Comedy","Ahmad");
        MovieDirectorDemo.put("Animi","Ali");
        MovieDirectorDemo.put("Scaryy","Hmad");
        MovieDirectorDemo.put("Action","Amad");
        System.out.println(MovieDirectorDemo);
        System.out.println(MovieDirectorDemo.get("Comedy"));
        System.out.println(MovieDirectorDemo.containsKey("Comedy"));
        System.out.println(MovieDirectorDemo.containsKey("Art"));
        MovieDirectorDemo.put("Action","Ahlam");
        System.out.println(MovieDirectorDemo);
        MovieDirectorDemo.remove("Scaryy");
        System.out.println(MovieDirectorDemo);
        System.out.println(MovieDirectorDemo.size());



    }
}
