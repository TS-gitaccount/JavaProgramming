//write a program to print maximum element of each row
package Arrays.TwoDArrays;

public class MaxEleRow {
    static void main(String[] args) {
        int [][] a={{10,20,30},{40,70,60}};
        for (int i=0;i<a.length;i++) {
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>max) {
                    max = a[i][j];
                }
            }
            System.out.println("Row :"+(i+1)+" maximum element :"+max);
        }
    }
}
