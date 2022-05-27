import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    
        //Given five positive integers, 
        //find the minimum and maximum values 
        //that can be calculated by summing 
        //exactly four of the five integers. 
        //Then print the respective minimum 
        //and maximum values as a single line of two space-separated long integers.
        Collections.sort(arr); // sort to get the smallest first and largest last item        
        int smallestNumber = arr.get(0);
        int largestNumber = arr.get(4); // array is fixed size of 5 elements
        long sum = 0;
        for (int i : arr) {
            sum += (long)i;
        }
        System.out.print((sum - largestNumber) + " " + (sum - smallestNumber));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
