import java.io.*;
import java.util.*;

public class anagram {//A beautiful experience while making this code by my mind it took time

   public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    ch2[j] = ' ';
                    break;
                } else {
                    if (j == ch2.length - 1) {
                        return false;
                    }
                }
            }
        }
        for(int j=0;j<ch2.length;j++){
            if(ch2[j]!=' '){
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean result=isAnagram(s1, s2);
        if(result==true)
        System.out.println("Anagrams");
        else
        System.out.println("Not Anagrams");
    }
}
