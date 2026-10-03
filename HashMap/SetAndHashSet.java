import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetAndHashSet {
    public static void main(String[] args){
        Set<String> names=new LinkedHashSet<>();
        names.add("Mayank Singh");
        names.add("Vineet kumar");
        names.add("Akhilesh singh");
        names.remove("Mayank Singh");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Vineet kuma"));
        //names.clear();
        System.out.println(names.isEmpty());
        for(String name : names){
            System.out.println(name);
        }
        System.out.println();
        names.forEach(System.out::println);
    }
}