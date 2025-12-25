package String;

import java.util.Scanner;

public class NumberToWords {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println(toWords(num));
    }
    public static String toWords(int num) {


        String[] ones={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
                "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tenth={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] hundred={"","thousand","million","billion"};

        if(num==0)
            return "zero";

        StringBuffer res = new StringBuffer();
        int index=0;

        while(num>0){
        if(num%1000!=0) {
            int part = num % 1000;
            StringBuffer words = new StringBuffer();

        if (part>=100){
            words.append(ones[part/100]).append(" Hundred ");
            part = part%100;
        }
        if (part>=20){
            words.append(tenth[part/10]).append(" ");
            part = part%10;
        }
        if (part>0){
            words.append(ones[part]).append(" ");
        }
        words.append(hundred[index]).append(" ");
        res.insert(0,words);

        }
        num=num/1000;
        index++;
        }
       return  res.toString().trim();
    }
}
