//Write a program to search a element from the given array

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static void main(String[] args) {
        int[] a={1,2,3,6,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the number to search : ");
        int n=sc.nextInt();
        System.out.println(findElement(a,n));
    }
    public static String findElement(int[] a,int n) {
    int st=0;
    int end=a.length-1;
    while(st<=end){
        int mid=(st+end)/2;
        if(a[mid]==n){
            return "Element found at index "+mid;
        }
        else if(a[mid]>n){
            end=mid-1;
        }
        else{
            st=mid+1;
        }
    }
    return "Element not found";
    }
}
