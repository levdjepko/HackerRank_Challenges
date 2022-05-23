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
