def miniMaxSum(arr):
    arr.sort()
    total_sum = sum(arr)
    min_number = arr[0]
    max_number = arr[-1]
    min_sum_of_four = total_sum - max_number
    max_sum_of_four = total_sum - min_number
    print(min_sum_of_four, max_sum_of_four)
