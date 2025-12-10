
package number_system.if_else;
import   java.util.Scanner;
public class IsMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table to check the multiple:");
        int table = sc.nextInt();
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(checkMultiple(n,table));

    }
    public static String checkMultiple(int n,int table){
        if(n%table==0){
            return n + " is the multiple of " + table;
        }
        return n + " is not the multiple of " + table;
    }
}
