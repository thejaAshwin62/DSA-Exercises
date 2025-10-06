package JspDsa.Stack;

import java.util.Arrays;

public class SelectionSort {

    public static void selSort(int arr[]){
        for(int i =0;i<arr.length;i++){
            int minIndex = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

        }
    }

    public static void main(String[] args) {
        int []arr = {3,5,1,2,5,6};
        selSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
