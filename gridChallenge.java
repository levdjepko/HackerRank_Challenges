public static String gridChallenge(List<String> grid) {
  
  
  /*Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. 
  Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.*/
  
        List<String> sortedStrings = new ArrayList<>();
        boolean resultIsWrong = false;
        // this sorts the string
        for (int i = 0; i < grid.size(); i++) {
            char currentString[] = grid.get(i).toCharArray();
            Arrays.sort(currentString);
            sortedStrings.add(new String(currentString));
        }
        System.out.println(sortedStrings);
        for (int i = 0; i < sortedStrings.get(0).length(); i++) {
            for (int j = 0; j < sortedStrings.size() - 1; j++) {
                if (sortedStrings.get(j).charAt(i) > sortedStrings.get(j + 1).charAt(i)){
                    //System.out.println(sortedStrings.get(j).charAt(i));
                    //System.out.println(sortedStrings.get(j + 1).charAt(i));
                    resultIsWrong = true;
                }
            }
        }
        return (resultIsWrong ? "NO":"YES");
    }
