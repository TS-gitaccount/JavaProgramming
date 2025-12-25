package String;

import java.util.Arrays;

public class Capitalize {
    static void main(String[] args) {
        String str = "java is oop langauage";
        System.out.println(toCapitalize(str));
    }
    public static String toCapitalize(String s) {
       char[] ch = s.toCharArray();
        if(ch[0]>='a' && ch[0]<='z')
            ch[0]=(char)(ch[0]-32);
       for (int i = 0; i < ch.length; i++) {
           if((ch[i]==' '&& ch[i+1]!=' ')){
              if(ch[i+1]>='a' && ch[i+1]<='z'){
                  ch[i+1]=(char)(ch[i+1]-32);
              }
           }
       }
        return new String(ch);
    }
}
