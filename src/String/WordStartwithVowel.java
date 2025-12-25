package String;

public class WordStartwithVowel {
    static void main(String[] args) {
        String s="java is a programming language";
        System.out.println(startwithvowel(s));//without method
        System.out.println(vowelstart(s));//startWith method
    }
    public static String startwithvowel(String s){
        s.toLowerCase();
        char[] ch = s.toCharArray();
        int count = 0;
        if(ch[0] =='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u')
        count++;

        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] == ' ' && ch[i + 1] != ' ')) {
                if (ch[i + 1] == 'a' || ch[i + 1] == 'e' || ch[i + 1] == 'i' || ch[ i + 1] == 'o' || ch[i + 1] == 'u')
                    count++;
            }
        }
        return "Vowel word count: " + count;
    }

    public static String vowelstart(String s){
        s.toLowerCase();
        String[] strs = s.split(" ");
        int count = 0;
        for(String str : strs){
            if(str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o") || str.startsWith("u")){
                count++;
            }
        }
        return "Vowel word count: " + count;
    }
}
