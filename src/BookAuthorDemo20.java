import java.util.HashMap;

public class BookAuthorDemo20 {
    static void main(String[] args) {
        HashMap<String,String> BookAuthorDemo20=new HashMap<>();
        BookAuthorDemo20.put("Oman Rocks","Muna");
        BookAuthorDemo20.put("UK Maps","Sara");
        BookAuthorDemo20.put("Qatar Geograpgy ","Ahmad");
        BookAuthorDemo20.put("Thiland Tourism","Balal");
        System.out.println(BookAuthorDemo20);
        System.out.println(BookAuthorDemo20.get("Qatar Geograpgy"));
        System.out.println(BookAuthorDemo20.containsKey("Qatar Geograpgy"));
        BookAuthorDemo20.put("Qatar Geograpgy ","Shahd");
        System.out.println(BookAuthorDemo20);
        BookAuthorDemo20.remove("Oman Rocks");
        System.out.println(BookAuthorDemo20);
        System.out.println(BookAuthorDemo20.size());



    }
}
