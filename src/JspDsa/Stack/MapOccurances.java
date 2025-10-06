package JspDsa.Stack;

import java.util.HashMap;
import java.util.Map;

public class MapOccurances {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "h");
        m.put(2, "e");
        m.put(3, "l");
        m.put(4, "l");
        m.put(5, "o");

        Map<String, Integer> occurrences = new HashMap<>();
        for (String value : m.values()) {
           if(occurrences.containsKey(value)){
               occurrences.put(value, occurrences.get(value)+1);
           }else{
               occurrences.put(value,1);
           }
        }

//        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        for(String s :occurrences.keySet()){
            System.out.println(s + "" +occurrences.get(s));
        }

    }
}