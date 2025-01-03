def diagonalDifference(arr):
    left_diagonal = right_diagonal = 0
    for i in range(len(arr)):
        left_diagonal += arr[i][i]
        right_diagonal += arr[i][len(arr)-i-1]
    difference = abs(right_diagonal - left_diagonal)
    return difference  
