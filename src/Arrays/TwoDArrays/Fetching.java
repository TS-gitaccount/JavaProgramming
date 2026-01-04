package Arrays.TwoDArrays;
import java.util.Arrays;
import java.util.Scanner;

public class Fetching {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows size:");
        int rsize = sc.nextInt();
        System.out.println("Enter the number of columns size:");
        int csize = sc.nextInt();
        int[][] a = new int[rsize][csize];
        for (int i=0;i<rsize;i++) {
            for (int j = 0; j < csize; j++) {
                System.out.println("Enter the value of row "+(i+1)+" col "+(j+1));
                a[i][j] = sc.nextInt();
            }
        }

//        int [][] a={{10,20,30},{40,50,60}};
        for (int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        System.out.println();

        for(int [] arr:a){
            for(int x:arr)
                System.out.print(x + " ");
            System.out.println();
        }

        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));



    }
}
