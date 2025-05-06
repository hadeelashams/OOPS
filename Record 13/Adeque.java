import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Adeque{
    public static void main(String[] args) {
       
        Deque<String> deque = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of elements add to the deque:");
        int numElements = scanner.nextInt();  // Number of elements to add
        scanner.nextLine(); 
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            deque.add(element);  
        }

        System.out.println("Deque after manual additions: " + deque);

        

        String removedElement = deque.remove();
        System.out.println("Element removed using remove(): " + removedElement);
        System.out.println("Deque after remove(): " + deque);

       
        String polledElement = deque.poll();
        System.out.println("Element removed using poll(): " + polledElement);
        System.out.println("Deque after poll(): " + deque);

        
        String polledLastElement = deque.pollLast();
        System.out.println("Element removed using pollLast(): " + polledLastElement);
        System.out.println("Deque after pollLast(): " + deque);

        
        scanner.close();
    }
}