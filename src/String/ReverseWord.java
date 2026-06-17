package String;

public class ReverseWord {
    static void main(String[] args) {
        String s1 = "java is an oop lang";
        char[] ch = s1.toCharArray();
        int i = 0,j=0;
        String rev="";
        while(j<ch.length){
            while(j<ch.length && ch[j]!=' '){
                j++;
            }
            int k=j-1;
            String temp="";
            while(k>=i) {
                temp += ch[k] ;
                k--;
            }
            rev += temp;
            if(j<ch.length)
                rev+=" ";

            j++;
            i=j;

        }
        System.out.println(rev);


    }
}
