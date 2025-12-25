// write a program to print the sorted array using method
package Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] arr={0,89,2,43,11,43};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
