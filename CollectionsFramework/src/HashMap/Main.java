package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer>  empIds = new HashMap< >();

        empIds.put("Dhanushka", 1);
        empIds.put("Deneth", 2);
        empIds.put("Asela", 3);

        System.out.println(empIds);
        System.out.println(empIds.get("Deneth"));
        System.out.println(empIds.containsKey("Bimsara"));

        empIds.put("Deneth", 4); // IF found replace the value ELSE add new KV pair
        System.out.println(empIds);
        empIds.replace("Kramer", 5); // If found replace the value ELSE do nothing
        System.out.println(empIds);

        empIds.remove("Deneth");
        System.out.println(empIds);
    }
}
