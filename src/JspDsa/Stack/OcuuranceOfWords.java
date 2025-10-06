package JspDsa.Stack;

import java.util.LinkedHashMap;
import java.util.Map;

public class OcuuranceOfWords {
    public static void main(String[] args) {
        String str = "hi hello hi bye hi hello bye bye bye";

        LinkedHashMap<String ,Integer> m = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String word = "";
            while (i<str.length() && ch!=' '){
                word+=ch;
                i++;
                if(i<str.length()){
                    ch=str.charAt(i);
                }
            }
            if(m.containsKey(word)){
                m.put(word,m.get(word)+1);
            }else{
                m.put(word,1);
            }

        }

        for(Map.Entry<String,Integer>i:m.entrySet()){
            System.out.println(i.getKey()+ ": "+i.getValue());
        }




    }
}
