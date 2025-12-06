 public static void separateNumbers(String s)  { 

        String sub = "";
        boolean isValid = false;
        for (int i = 1; i <= s.length() / 2; i++) {
            sub = s.substring(0, i);
            long num = Long.parseLong(sub);
            StringBuilder valid = new StringBuilder(sub);
            while (valid.length() < s.length()) {
                valid.append(++num);
            }
            if (s.equals(valid.toString())) {
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "YES " + sub : "NO");
    }
