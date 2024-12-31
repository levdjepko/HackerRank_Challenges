import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        /*
        x1 + v1*A = x3
        x2 + v2*B = x3
        This is what they asked for. The wording of this problem is incorrect. In reality, they have to jump at each step
        int left = x1;
        int right = x2;
        
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < i * v1 + x1 + x2; j++) {
                left = x1 + v1* i;
                right = x2 + v2* j;
                if (left == right) {
                    System.out.println("x1: " + x1 + " jumped: " + i +
                     " for "+ v1 + " \nx2:" + x2 + " jumped: " + j + " for " + v2);
                    return "YES";
                }
            }
        }
        return "NO";*/
        // Instead, both kangaroos should jump the same number of steps:
        // x1 + i * v1 = x2 + i * v2
        // x1 - x2 = i v2 - i v1
        // i = (x1 - x2) / (v2 - v1)
        if (v2 - v1 == 0) {
            //same speeds, thus we should have the same x1 and x2:
            if (x1 - x2 == 0) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            int i = (x1 - x2) / (v2 - v1);
            if ((x1 - x2) % (v2 - v1) == 0 && i >= 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
