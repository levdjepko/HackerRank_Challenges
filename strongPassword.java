public static int minimumNumber(int n, String password) {
  
        // Return the minimum number of characters to make the password strong
        // Strong password has length >6, uppercasse char, lowercase char, digit, and special char
  
        String special_characters = "!@#$%^&*()-+";
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;
        int length = password.length();
        
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                hasLowercase = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
            if (special_characters.contains(Character.toString(password.charAt(i)))) {
                hasSpecialChar = true;
            }
        }
        int remainingLength = 0;
        int stillMissing = 0;
        if (!hasLowercase) {remainingLength++;}
        if (!hasUppercase) {remainingLength++;}
        if (!hasDigit) {remainingLength++;}
        if (!hasSpecialChar) {remainingLength++;}
        if (length + remainingLength < 6) {
            stillMissing = 6 - remainingLength - length;
        }
        return (remainingLength + stillMissing);
    }
