package JspDsa.Stack;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOcuurancesMap {

    public static void main(String[] args) {
        String s = "hello";
        LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (m.containsKey(ch)) {
                m.put(ch, m.get(ch) + 1);
            } else {
                m.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}