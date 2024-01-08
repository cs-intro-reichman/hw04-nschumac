import java.util.HashSet;

public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        // + 1 becuase array is length of n but 
        // i also need to store 0
        boolean[] characterFoundArray = new boolean[array.length + 1];

        for (int i = 0; i < array.length; ++i) {
            characterFoundArray[array[i]] = true;
        }

        for (int i = 0; i < characterFoundArray.length; ++i) {
            // number is missing in array
            if (!characterFoundArray[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int largest, secondLargest;

        largest = secondLargest = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
        }
        return secondLargest;
    }

    private static boolean arrayContainsInt(int [] array, int integerToFind) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == integerToFind) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length; ++i) {
            if (!arrayContainsInt(array2, array1[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {

        if (array.length <= 1) {
            return true;
        }
    
        boolean increaseOrDecrease = array[0] < array[1];

        for (int i = 1; i < array.length; ++i) {
            if (increaseOrDecrease) {
                if (array[i - 1] > array[i]) {
                    return false;
                }
            } else {
                if (array[i - 1] < array[i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
