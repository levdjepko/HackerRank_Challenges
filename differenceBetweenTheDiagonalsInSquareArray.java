class differenceBetweenTheDiagonalsInSquareArray {

    /*     
    11 2 4
    4 5 6
    10 8 -12
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        
        // get the first diagonal items - same i and j, essentially
        // and at the same time get the second diagonal
        for (int i = 0; i < size; i++) {
            firstDiagonal += arr.get(i).get(i);
            secondDiagonal += arr.get(i).get(size - i - 1);
        } 
        int difference = Math.abs(firstDiagonal - secondDiagonal);
        return difference;
    }


}
