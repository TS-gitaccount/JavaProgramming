package String;

public class RemoveDuplicateCharacter {
    static void main(String[] args) {
        String str="madam";
        System.out.println(removeDuplicate(str));
        System.out.println( removeCharacter(str)); //replace method

    }

    public static String removeDuplicate(String str) {
        char[] ch = str.toCharArray();
        String res="";
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j] && ch[i]!=Character.MAX_VALUE){
                    ch[j]=Character.MAX_VALUE;
                }
            }
            if(ch[i]!=Character.MAX_VALUE){
                res+=ch[i];
            }
        }
        return res;
    }

    //using replace method
    public static String removeCharacter(String str) {
    String res="";
    while(str.length()>0) {
        char ch=str.charAt(0);
        str=str.replace(ch+"","");
        res+=ch;
    }
    return res;
    }


    //using HashMap
}
