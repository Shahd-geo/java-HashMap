import java.util.HashMap;

public class BookAuthorDemo {
    static void main(String[] args) {
        HashMap<String,String> BookAuthorDemo=new HashMap<>();
        BookAuthorDemo.put("Oman","Muna");
        BookAuthorDemo.put("UK Maps","Sara");
        BookAuthorDemo.put("Qatar Geograpgy ","Ahmad");
        BookAuthorDemo.put("Thiland Tourism","Balal");
        System.out.println(BookAuthorDemo);
        System.out.println( BookAuthorDemo.get("UK Maps"));
        System.out.println( BookAuthorDemo.containsKey("UK Maps"));
        BookAuthorDemo.put("Thiland Tourism","Bnaj");
        System.out.println(BookAuthorDemo);
        BookAuthorDemo.remove("Thiland Tourism") ;
        System.out.println(BookAuthorDemo);
        System.out.println(BookAuthorDemo.size());

    }
}
