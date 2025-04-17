import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    

    public static String pangrams(String s) {
        char [] inputInCharacters = s.toCharArray();
        HashMap <Character, Integer> frequency = new HashMap<Character, Integer>();
        int numberOfLetters = 0;
        // iterate over all the characters in a string, and fill the hashMap with characters:
        for (int i = 0; i < inputInCharacters.length; i++) {
            if (!frequency.containsKey(Character.toLowerCase(inputInCharacters[i]))) {
                    frequency.put(Character.toLowerCase(inputInCharacters[i]), 1);
            }
        }
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (char c : alphabet) {
            if (frequency.containsKey(c)){
                numberOfLetters++;
            }
        }
        if (numberOfLetters >= 26) {
            return "pangram";
        }
        else {
            return "not pangram";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
