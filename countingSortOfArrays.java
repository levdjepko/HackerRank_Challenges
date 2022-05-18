class CountingSort {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     
     Alternative Sorting
  Another sorting method, the counting sort, does not require comparison. Instead, you create an integer array whose index range covers the entire range of values in your array to sort. Each time a value occurs in the original array, you increment the counter at that index. At the end, run through your counting array, printing the value of each non-zero valued index that number of times.

  Example

  All of the values are in the range , so create an array of zeros, . The results of each iteration follow:

    i	arr[i]	result
    0	  1	  [0, 1, 0, 0]
    1	  1	  [0, 2, 0, 0]
    2	  3	  [0, 2, 0, 1]
    3	  2	  [0, 2, 1, 1]
    4	  1	  [0, 3, 1, 1]
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // the assumption is that the array will have only elements between 0 and 99
        Integer[] frequencyArray = new Integer[100];
        Arrays.fill(frequencyArray, 0);
        // iterate over every element of the array and add them to the frequency array
        for (int i = 0; i < arr.size(); i++) {
            frequencyArray[arr.get(i)]++;
        }
        List<Integer> resultingList = Arrays.asList(frequencyArray);
        
        return resultingList;
    }

}
