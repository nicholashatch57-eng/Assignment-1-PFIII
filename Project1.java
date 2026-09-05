
import java.util.Scanner;
/*
PF III: Assignment 1
Implement a menu based program with the following array-based list functions:

ADD (at the end of array)
INSERT (element at a given location)
DELETE (element from a given location)
SHOW (all array elements)
COUNT (total number of elements)
CLEAR (initialize array) */

public class Project1 {
    public static void main(String[] arg){
        Scanner input= new Scanner(System.in);

        String[] students = new String[100];
        int count = 0;
        int choice = 0;

while (choice != 7) {
            System.out.println("Menu:");
            System.out.println("1. ADD"); // adds element at the end of array
            System.out.println("2. INSERT"); // can insert element to a given location
            System.out.println("3. DELETE"); // can delete elements from given location
            System.out.println("4. SHOW"); // shows all the element in the array
            System.out.println("5. COUNT"); // shows total number of inputed elements
            System.out.println("6. CLEAR"); // initalize the array
            System.out.println("7. EXIT"); // exits the program
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

switch (choice) {
    case 1: 
        if (count < students.length) {
            System.out.print("Enter student name and grade: ");
            students[count] = input.nextLine();
            count++;

        System.out.println("Entry has been added.");
        } else {
        System.out.println("The array is full.");
        }
        break;

    case 2: 
        if (count < students.length) {
            System.out.print("Enter the position where you want to insert element");
            int insertIndex = input.nextInt();
            input.nextLine();

            if (insertIndex >= 0 && insertIndex <= count) {
                for (int i = count; i > insertIndex; i--) {
                    students[i] = students[i - 1];
                }

                System.out.print("Enter student name and grade: ");
                students[insertIndex] = input.nextLine();
                count++;

                System.out.println("Entry has been inserted.");
            } else {
                System.out.println("Invalid position. Please try again.");
            }
            } else {
                System.out.println("The array is full.");
            }
            break;

    case 3:
        if (count > 0) {
            System.out.print("Enter the position of the element to delete: ");
            int deleteIndex = input.nextInt();
            input.nextLine();

            if (deleteIndex >= 0 && deleteIndex < count) {
                for (int i = deleteIndex; i < count - 1; i++) {
                    students[i] = students[i + 1];
                }

                count--;
                students[count] = null;

                System.out.println("Entry deleted successfully.");
            } else {
                System.out.println("Invalid position. Please try again.");
            }
            } else {
                System.out.println("The array is empty. Nothing to delete.");
            }
            break;

    case 4:
        if (count == 0) {
            System.out.println("The array is empty.");
        } else {
            System.out.println("Student entries:");

            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
        break;

    case 5:
        System.out.println("Your total number of entries is: " + count);
        break;

    case 6:
        students = new String[100];
        count = 0;

        System.out.println("The array has been cleared.");
        break;
    
    case 7:
        System.out.println("Exiting the program. Goodbye!");
        break;

    default:
        System.out.println("Invalid choice. Please try again with a digit of 1-7.");
        break;
    }
}
input.close();
    }
}


             
      