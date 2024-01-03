class CountingSort {
    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     
     Alternative Sorting
  Another sorting method, the counting sort, does not require comparison. 
  Instead, you create an integer array whose index range covers the entire 
  range of values in your array to sort. Each time a value occurs in the 
  original array, you increment the counter at that index. At the end, 
  run through your counting array, printing the value of each non-zero valued index that number of times.

  Example:

  All of the values are in the range, so create an array of zeros, The results of each iteration follow:

    i	arr[i]	result
    0	  1	  [0, 1, 0, 0]
    1	  1	  [0, 2, 0, 0]
    2	  3	  [0, 2, 0, 1]
    3	  2	  [0, 2, 1, 1]
    4	  1	  [0, 3, 1, 1]
     */
    
    public static List<Integer> countingSort(List<Integer> arr) {
    
        // We have to return an array of frequency of the elements
        // create our array of size n = 100 (as per the task)
        
        Integer[] results = new Integer[100];    
        // make all the elements of this array 0:
        Arrays.fill(results, 0);
        // iterate over the array and increment every value we encounter
        for (int element: arr) {
            results[element]++;
        }
        // the return type of List:
        List<Integer> returnResult = Arrays.asList(results);
        return returnResult;
    }

}
