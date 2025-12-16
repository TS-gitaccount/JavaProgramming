package String;

import java.util.Arrays;
import java.util.HashMap;

public class OccurenceOfWord {
    public static void main(String[] args) {
        String str = "java is a programming language , java is a oop language .";
        findOccurence(str);
        System.out.println("\n"+HMfindOccurence(str));//using HashMap
    }

    public static void findOccurence(String str) {
        String[] strArr = str.split("\\s+");
        for (int i = 0; i < strArr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j]) && strArr[i] != "") {
                    count++;
                    strArr[j] = "";
                }
            }
            if (strArr[i] != "") {
                System.out.print(strArr[i] + "---->" + count+"\t\t");
            }
        }
    }

//    using HashMap
    public static HashMap<String, Integer> HMfindOccurence(String str) {
        HashMap <String, Integer> map = new HashMap<>();
        for (String c: str.split(" ")) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        return map;

    }

}