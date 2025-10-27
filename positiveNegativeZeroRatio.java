import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {


    public static void plusMinus(List<Integer> arr) {        
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                countNegative++;                
            } else if (arr.get(i) > 0) {
                countPositive++;                
            } else {
                countZeros++;                
            }
        }
        
        System.out.println((double)countPositive / (double)arr.size());
        System.out.println((double)countNegative / (double)arr.size());
        System.out.println((double)countZeros / (double)arr.size());
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
