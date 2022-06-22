public static int countingValleys(int steps, String path) {
        /* _/\      _
              \    /
               \/\/     
               
               
          A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
          A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
          Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
        */
        int currentHeight = 0;
        // all the hikes start and end at the height of sea level (0)
        // so, we need to count how many separate valleys (or getting under the sea level) there are
        boolean isValley = false;
        int countValleys = 0;
        
        // iterate over the array and keep track of valleys:
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                // we get lower
                currentHeight--;
            } else {
                // we get higher
                currentHeight++;
            }
            if (currentHeight == -1 && !isValley) {
                // valley begins
                isValley = true;
                System.out.println("Valley begins at " + i );
            }
            if (currentHeight == 0 && isValley) {
                countValleys++;
                isValley = false;
                System.out.println("Valley ends at " + i );
            }
        }       
        return countValleys;

    }
