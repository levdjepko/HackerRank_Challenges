public static String caesarCipher(String s, int k) {
        
        String cipherAlphabet; // this will hold the new string
        StringBuilder sb = new StringBuilder();
        
        
        for (int i = 0; i < s.length(); i++) {
            int asciiPositionOfLetter = (int)s.charAt(i);
            if (asciiPositionOfLetter >= 65 && asciiPositionOfLetter <= 90) {
                // capital character
                int shiftedPosition = ((asciiPositionOfLetter - 65 + k) % 26) + 65;
                sb.append((char)shiftedPosition);
            } else if (asciiPositionOfLetter >= 97 && asciiPositionOfLetter <= 122) {
                // lower case character
                int shiftedPosition = ((asciiPositionOfLetter - 97 + k) % 26) + 97;
                sb.append((char)shiftedPosition);
            } else {
                sb.append(s.charAt(i)); // for symbols and spaces etc.
            }            
        }
        cipherAlphabet = sb.toString();
        System.out.println(cipherAlphabet);
        return cipherAlphabet;

    }
// SAME but Different:

public static String caesarCipher(String s, int k) {
        // rotate the String by k (Caesar Cipher)
        StringBuilder sb = new StringBuilder();
        int valueOfa = 'a';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                    boolean isCapital = Character.isUpperCase(c);
                    int valueOfChar = Character.toLowerCase(c);
                    int currentCharPosition = valueOfChar - valueOfa; // 0 for 'a'
                    int newValue = (currentCharPosition + k) % 26 + valueOfa;
                    char newCharacter = (char)newValue;
                    if (isCapital) {
                        sb.append(Character.toUpperCase(newCharacter));} 
                    else {
                        sb.append(newCharacter); 
                        }
                } else {
                    sb.append(c);
                }
        }
        return sb.toString();
    }

