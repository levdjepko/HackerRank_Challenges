public static int birthdayCakeCandles(List<int> candles)
    {
        candles.Sort();
        int count = 1;
        int item = candles[candles.Count - 1];
        for (int i = candles.Count - 2; i > 0; i--) {
            if (candles[i] != item) {
                break;
            }
            count++;
        }
        return count;
    }
