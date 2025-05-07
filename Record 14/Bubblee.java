import java.util.*;

class Bubblee {
    // Method to perform bubble sort with a generic type that extends Comparable
    public static <T extends Comparable<T>> T[] bsort(T arr[], int limit) {
        int i, j;
        
        // Outer loop for number of passes
        for(i = 0; i < limit - 1; i++) {
            // Inner loop for comparing and swapping
            for(j = 0; j < limit - i - 1; j++) {
                // Compare elements using compareTo() for generics
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap elements if they are in the wrong order
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

public class Bsort {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        
        String[] s = new String[n];
        System.out.println("Enter the elements: ");
        
        // Read the elements
        for(i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        // Call the bubble sort method from Bubblee
        s = Bubblee.bsort(s, n);

        // Print the sorted elements
        System.out.println("After sorting:");
        for(i = 0; i < n; i++) {
            System.out.println(s[i]); // Print each element on a new line
        }
    }
}

