package lv.javaguru.java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListApplication {

    public static void main(String[] args) {
        // Use cases:
        // 1. Add task to list
        // 2. Remove task from list
        // 3. Print task list to console
        // 4. Exit

        List<Task> tasks = new ArrayList<Task>();
        while (true) {
            printProgramMenu();
            int menuItem = getFromUserMenuItemToExecute();
            if (menuItem == 4) {
                break;
            }
            switch (menuItem) {
                case 1: {
                    addTaskToList(tasks);
                    break;
                }
                case 2: {
                    removeTaskFromList(tasks);
                    break;
                }
                case 3: {
                    printTaskListToConsole(tasks);
                    break;
                }
            }
        }

    }

    private static void addTaskToList(List<Task> tasks) {
        // TODO: please implement
    }

    private static void removeTaskFromList(List<Task> tasks) {
        // TODO: please implement
    }

    private static void printTaskListToConsole(List<Task> tasks) {
        // TODO: please implement
    }

    private static void printProgramMenu() {
        System.out.println("Program Menu:");
        System.out.println("1. Add task to list");
        System.out.println("2. Remove task from list");
        System.out.println("3. Print list to console");
        System.out.println("4. Exit");
    }

    private static int getFromUserMenuItemToExecute() {
        System.out.print("Please enter menu item number to execute:");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

}
