//Write a program to search a element from the given array

package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        int[] a={1,2,3,6,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the number to search : ");
        int n=sc.nextInt();
        System.out.println(findElement(a,n));
    }
    public static String findElement(int[] a,int n){
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                return "Element found at index "+i;
            }
        }
        return "Element not found";
    }
}
