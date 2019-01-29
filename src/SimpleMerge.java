/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int x = 0; x < arr2.length; x++) {
                if (arr2[x] < arr1[i]) {
                    int temp = arr1[i];
                    arr1[i]= arr2[x];
                    arr2[x]= temp;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int x = arr1.length; x < arr3.length; x++) {
            arr3[x] = arr2[x];
        }
        return arr3;
    }
}
