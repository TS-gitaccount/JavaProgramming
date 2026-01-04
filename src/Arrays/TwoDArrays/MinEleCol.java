//write a program to print maximum element of each row
package Arrays.TwoDArrays;

public class MinEleCol {
    static void main(String[] args) {
        int [][] a={{10,20,30},{40,70,60},{50,80,10}};
        for (int i=0;i<a.length;i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] < min) {
                    min = a[j][i];
                }
            }
            System.out.println("Col :" +(i+1) + " maximum element :" + min);

        }
    }
}
