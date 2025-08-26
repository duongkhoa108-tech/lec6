
package lec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilterEvenNumbers {
    public static ArrayList<Integer> filterEven(int[] arr) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        ArrayList<Integer> evenNumbers = filterEven(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Even numbers (ArrayList): " + evenNumbers);

        scanner.close();
    }
}
