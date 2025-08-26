package lec6;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        int choice;

        do {
            // Menu
            System.out.println("\n===== TO-DO LIST MENU =====");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // bỏ newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("Your To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println(i + ". " + toDoList.get(i));
                        }
                    }
                    break;

                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter index of task to remove: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < toDoList.size()) {
                            String removed = toDoList.remove(index);
                            System.out.println("Removed task: " + removed);
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
