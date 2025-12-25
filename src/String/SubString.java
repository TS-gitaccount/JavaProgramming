package String;

public class SubString {
    static void main(String[] args) {
        String s = "java";
        toSubString(s);
    }
    public static void toSubString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
