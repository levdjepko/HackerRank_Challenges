import java.io.*;
import java.util.*;

/*      Sample Input

        S;M;plasticCup()

        C;V;mobile phone

        C;C;coffee machine

        S;C;LargeSoftwareBook

        C;M;white sheet of paper

        S;V;pictureFrame

        Sample Output

        plastic cup

        mobilePhone

        CoffeeMachine

        large software book

        whiteSheetOfPaper()

        picture frame 
        */

public class Solution {
    
    static String splitStringToWords(String str) {
        // all small letters
        int leftPosition = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                sb.append(str.substring(leftPosition, i).toLowerCase());
                leftPosition = i;
                sb.append(" ");
            }
        }
        sb.append(str.substring(leftPosition, str.length()).toLowerCase());
        
        return sb.toString();
    }
    
    static String combineStringToWords(String str) {
        // all small letters
        int leftPosition = 0;
        StringBuilder sb = new StringBuilder();
        // first word
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.substring(leftPosition, i).toLowerCase());
                leftPosition = i + 1;
                break;
            }
        }
        // the rest of the words
        for (int i = leftPosition; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.substring(leftPosition, leftPosition + 1).toUpperCase() + str.substring(leftPosition + 1, i).toLowerCase());
                leftPosition = i + 1;
            }
        }
        
        sb.append(str.substring(leftPosition, leftPosition + 1).toUpperCase() + str.substring(leftPosition + 1, str.length()).toLowerCase());
        
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allInputStrings = new ArrayList<>();
        
        while(scanner.hasNext()) {
            allInputStrings.add(scanner.nextLine());
        }
        scanner.close();
        
        for (String element : allInputStrings) {
            // System.out.println(element);
            // split the first element from string
            String firstOperator = element.substring(0, 1);
            String secondOperator = element.substring(2, 3);
            String remainingPortion = element.substring(4, element.length());
            
            if (firstOperator.equals("S")) {
                // SPLIT
                if (secondOperator.equals("M")) {
                    // method ()
                    remainingPortion = remainingPortion.substring(0, remainingPortion.length() - 2);
                    System.out.println(splitStringToWords(remainingPortion));
                    // check???
                } else if (secondOperator.equals("C")) {
                    // Class
                    System.out.println(splitStringToWords(remainingPortion));
                    // DONE
                } else {
                    // variable V
                    System.out.println(splitStringToWords(remainingPortion));
                    // DONE
                }
                
                
            } else if (firstOperator.equals("C")) {
                // COMBINE
                if (secondOperator.equals("M")) {
                    // method ()
                    System.out.println(combineStringToWords(remainingPortion) + "()");
                } else if (secondOperator.equals("C")) {
                    // Class
                    //System.out.println(combineStringToWords(remainingPortion));
                    String result = combineStringToWords(remainingPortion);
                    System.out.println(result.substring(0,1).toUpperCase() + result.substring(1, result.length()));
                } else {
                    // variable
                    System.out.println(combineStringToWords(remainingPortion));
                }
                
            }
            
        }
        
        
    }
}
