public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    private static char characterToLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }
        return c;
    }

    private static char characterToUpperCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char)(c - 32);
        }
        return c;
    }

    private static boolean characterIsVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public static String capVowelsLowRest (String string) {
        String result = "";

        for (int i = 0; i < string.length(); ++i) {
            if (characterIsVowel(string.charAt(i))) {
                result += characterToUpperCase(string.charAt(i));
            } else {
                result += characterToLowerCase(string.charAt(i));
            }
        }
        return result;
    }

    public static String camelCase (String string) {
        String result = "";

        for (int i = 0; i < string.length(); ++i) {
            // trim spaces
            while (string.charAt(i) == ' ') {
                ++i;
            }

            // we found first character already, make first character
            // of new word uppercase
            if (result != "" && string.charAt(i - 1) == ' ') {
                result += characterToUpperCase(string.charAt(i));
            } else {
                result += characterToLowerCase(string.charAt(i));
            }
        }
        return result;
    }

    // Ask if allowed to use ArrayList<int> would be much better
    // wouldn't need two loops
    public static int[] allIndexOf (String string, char chr) {
        int indexOfCharacter = -1;
        int indexesFound = 0;
        
        // count number of characters that we have in the string
        do {
            indexOfCharacter = string.indexOf(chr, indexOfCharacter + 1);
            if (indexOfCharacter != -1) {
                indexesFound++;
            }
        } while (indexOfCharacter != -1); // didn't find character


        // result is amount of indexes found :shrug:
        int[] result = new int[indexesFound];
        int indexIndex = 0;

        // set the indices in the result array
        do {
            indexOfCharacter = string.indexOf(chr, indexOfCharacter + 1);
            if (indexOfCharacter != -1) {
                result[indexIndex++] = indexOfCharacter;
            }
        } while (indexOfCharacter != -1); // didn't find character

        return result;
    }
}
