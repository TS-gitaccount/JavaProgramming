// write a program to check the given year is leap year or not

package Number_System.if_else;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        System.out.println(isLeap(year));

    }
    public static String isLeap(int year){
        if(year%400==0||year%4==0&&year%100!=0){
            return "Given year is a leap year";
        }
        else
            return "Given year is not a leap year";
    }
}
