import java.util.HashMap;
class HaspMap {
public static void main(String[] args) {
    HashMap<String,Integer> Emplid =new HashMap<>();
    Emplid.put("Vineet",12345);
    Emplid.put("Mayank",1);
    Emplid.put("Anant",79854);
    System.out.println(Emplid);
    System.out.println(Emplid.get("Mayank"));
    System.out.println(Emplid.containsKey("George"));
    System.out.println(Emplid.containsValue(5));
    Emplid.put("Mayank",78933);
    System.out.println(Emplid);
    Emplid.replace("Mayan",1);
    System.out.println(Emplid);
    Emplid.putIfAbsent("Geoge",2);
    System.out.println(Emplid);
    Emplid.remove("Geoge");
    System.out.println(Emplid);
    }
}