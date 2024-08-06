package Arrays;

public class ContainsElements {
     public static boolean containsBoth(int[] arr, int elem1, int elem2) {
        boolean foundElem1 = false;
        boolean foundElem2 = false;
        
           for (int num : arr) {
            if (num == elem1) {
                foundElem1 = true;
            }
            if (num == elem2) {
                foundElem2 = true;
            }
               if (foundElem1 && foundElem2) {
                return true;
            }
        }
        
            return false;
    }

    public static void main(String[] args) {
          int[] numbers = {5, 12, 30, 23, 45};
        int element1 = 12;
        int element2 = 23;
        
        boolean result = containsBoth(numbers, element1, element2);
        if (result) {
            System.out.println("The array contains both " + element1 + " and " + element2);
        } else {
            System.out.println("The array does not contain both " + element1 + " and " + element2);
        }
    }
}

