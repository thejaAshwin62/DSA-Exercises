package HashTable;

import java.util.HashMap;

public class Common {
    public static boolean findCommon(int[] array1, int[] array2){
        HashMap<Integer,Boolean> hashMap = new HashMap<>();

        for(int i: array1){
            hashMap.put(i,true);
        }
        for(int j: array2){
            if( hashMap.get(j)!= null) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] array1 = {1,2,5};
        int [] array2= {2,4,5};

        System.out.println(findCommon(array1,array2));
    }
}
