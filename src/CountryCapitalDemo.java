import java.util.HashMap;

public class CountryCapitalDemo {
    static void main(String[] args) {
        HashMap<String,String> CountryCapitalDemo=new HashMap<>();
        CountryCapitalDemo.put("Oman","Muscat");
        CountryCapitalDemo.put("UK","London");
        CountryCapitalDemo.put("Qatar","Doha");
        CountryCapitalDemo.put("Thiland","Bankook");
        CountryCapitalDemo.put("china","Beijing");
        System.out.println(CountryCapitalDemo);
        System.out.println( CountryCapitalDemo.get("china"));
        System.out.println( CountryCapitalDemo.containsKey("china"));
        CountryCapitalDemo.put("UK","Manshester");
        System.out.println(CountryCapitalDemo);
        System.out.println(CountryCapitalDemo.size());




    }
}
