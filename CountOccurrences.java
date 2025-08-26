
package lec6;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

    
        System.out.print("Enter the number X to find: ");
        int x = scanner.nextInt();

       
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

      
        System.out.println("The number " + x + " appears " + count + " times.");

        scanner.close();
    }
}
