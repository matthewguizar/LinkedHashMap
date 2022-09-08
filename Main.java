import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        //issues with getting hash value so hashmap appears out of order
        Map<String, Integer> map1 = new HashMap<>();
        //doubly linked list connecting inserted items
        //advantage is that they store the order of insertion
        //LinkedHashMaps need more memory
        Map<String, Integer> map2 = new LinkedHashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);
        map.put("i", 9);
        map.put("j", 10);

        // for (String key: map.keySet()){
        //     System.out.println(key + " - " + map.get(key));
        // }

        map1.put("aaa", 1);
        map1.put("bbb", 2);
        map1.put("ccc", 3);
        map1.put("ddd", 4);
        map1.put("eee", 5);
        map1.put("fff", 6);
        map1.put("ggg", 7);
        map1.put("hhh", 8);
        map1.put("iii", 9);
        map1.put("jjj", 10);

        // for (String key : map1.keySet()){
        //     System.out.println(key + "-" + map1.get(key));
        // }

        map2.put("aaa", 1);
        map2.put("bbb", 2);
        map2.put("ccc", 3);
        map2.put("ddd", 4);
        map2.put("eee", 5);
        map2.put("fff", 6);
        map2.put("ggg", 7);
        map2.put("hhh", 8);
        map2.put("iii", 9);
        map2.put("jjj", 10);
        
        for (String key: map2.keySet()) {
            System.out.println(key+ '-' + map2.get(key));
        }

    }

}