package String;

public class EvenIndexCharacter {
    static void main(String[] args) {
        String str="Bangalore";
        String st="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)%2==0){
                st+=str.charAt(i);
            }
        }
        System.out.println(st);
    }
}
