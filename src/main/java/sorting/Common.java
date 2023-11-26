package sorting;

import java.util.*;

public class Common {

    /***************************************************
     * Create a program to Sort HashMap using TreeMap
     * @param map - HashMap
     * *************************************************/
    public static void sortHashMapUsingTreeMap(HashMap<Integer,String> map){

        Map<Integer,String> sortedHashMap = new TreeMap<>(map);

        Set<Map.Entry<Integer,String>> set = sortedHashMap.entrySet();

        for (Map.Entry<Integer, String> map1 : set) {
            System.out.println(map1.getKey() + ":" + map1.getValue());
        }
    }

    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(13, "Cython");
        map.put(2, "Python");
        sortHashMapUsingTreeMap(map);
    }
}
