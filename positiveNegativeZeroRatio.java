import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        //System.out.println(arr.toString());
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                countNegative++;
                //System.out.println("Negative element: " + arr.get(i));
            } else if (arr.get(i) > 0) {
                countPositive++;
                //System.out.println("Positive element: " + arr.get(i));
            } else {
                countZeros++;
                //System.out.println("zero element: " + arr.get(i));
            }
        }
        double positivePortion = (double)countPositive / (double)arr.size();
        System.out.println(positivePortion);
        double negativePortion = (double)countNegative / (double)arr.size();
        System.out.println(negativePortion);
        double zeroPortion = 1 - positivePortion - negativePortion;
        System.out.println(zeroPortion);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
