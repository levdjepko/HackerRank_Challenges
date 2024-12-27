public static int migratoryBirds(List<Integer> arr) {
    /* 
    Given an array of bird sightings where every element represents a bird type id, determine the id of      
    the most frequently sighted type. 
    If more than 1 type has been spotted that maximum amount, return   
    the smallest of their ids.
    */
        Collections.sort(arr);
        int maxCount = 0;
        int maxType = 0;
        int currentCount = 1;
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i)==arr.get(i-1)){
                currentCount++;
                if (i == arr.size() - 1) {
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        maxType = arr.get(i-1);
                    }
                }
            } else {
                if (currentCount > maxCount){
                    maxCount = currentCount;
                    maxType = arr.get(i - 1);
                }
                currentCount = 1;
            }
        }
        return maxType;

    }
