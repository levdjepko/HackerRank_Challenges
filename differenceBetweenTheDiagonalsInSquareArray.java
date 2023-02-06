class differenceBetweenTheDiagonalsInSquareArray {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
    11 2 4
    4 5 6
    10 8 -12
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int size = arr.size();
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        
        // get the first diagonal items - same i and j, essentially
        for (int i = 0; i < size; i++) {
            firstDiagonal += arr.get(i).get(i);
            secondDiagonal += arr.get(i).get(size - i - 1);
        } 
        int difference = Math.abs(firstDiagonal - secondDiagonal);
        return difference;
    }


}
