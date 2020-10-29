package B08Collections.P2Examples.E06;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String word = "repaper";
        Stack<Character> letters = new Stack<>();

        for (int i=0; i< word.length()/2; i++) {
            letters.push(word.charAt(i));
        }


        System.out.println(isPalindrome(word,letters));

    }

    public static boolean isPalindrome(String word , Stack<Character> letters) {

        for (int i= (word.length()/2+1);  i < word.length();  i++ ) {
            if (word.charAt(i) != letters.pop()) {
                return false;
            }
        }

        return true;

    }
}
