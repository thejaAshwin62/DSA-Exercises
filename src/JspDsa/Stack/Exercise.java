package JspDsa.Stack;

public class Exercise {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while(i < n && j < m) {
            if(arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }


        while(i < n) merged[k++] = arr1[i++];
        while(j < m) merged[k++] = arr2[j++];

        return merged;
    }

    public static void main(String[] args) {
        int arr[] = {3,8,18,23};
        int arr2[]={4,5,15};

        
    }
}
