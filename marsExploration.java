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

    /*
     * Complete the 'marsExploration' function below
     */

    public static int marsExploration(String s) {
        /* Explanation

        Sample 0
        S = SOSSPSSQSSOR, and signal length |s| = 12 . Sami sent  SOS messages (i.e.: 12/3 = 4).
        Signal shoud've been SOSSOSSOSSOS
    
        Expected signal: SOSSOSSOSSOS
        Recieved signal: SOSSPSSQSSOR

        We print the number of changed letters, which is .  */
        int len = s.length();
        int wrongLetterCount = 0;
        // the letters are supposed to be S, O, S, then repeat again
        for (int i = 0; i < len; i++) {
            if (i % 3 == 0 && s.charAt(i) != 'S') {
                wrongLetterCount++;
            }
            if (i % 3 == 1 && s.charAt(i) != 'O') {
                wrongLetterCount++;
            }
            if (i % 3 == 2 && s.charAt(i) != 'S') {
                wrongLetterCount++;
            }
        }
        
        return wrongLetterCount;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
