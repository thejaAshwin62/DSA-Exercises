package JspDsa.Stack;

import java.util.LinkedHashMap;
import java.util.Map;

public class OcucurancesArray {

    public static void main(String[] args) {
        int arr[] = {5,6,2,3,4,5,5,6,1,1,6,5};

        LinkedHashMap<Integer,Integer> m = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }else{
                m.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer, Integer> i:m.entrySet()){
            System.out.println(i.getKey()+ ":" +i.getValue());
        }



    }
}
