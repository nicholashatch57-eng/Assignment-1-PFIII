
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

while (choice != 7) {
            System.out.println("Menu:");
            System.out.println("1. ADD)"); // adds element at the end of array
            System.out.println("2. INSERT"); // can insert element to a given location
            System.out.println("3. DELETE"); // can delete elements from given location
            System.out.println("4. SHOW"); // shows all the element in the array
            System.out.println("5. COUNT"); // shows total number of inputed elements
            System.out.println("6. CLEAR"); // initalize the array
            System.out.println("7. EXIT"); // exits the program
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

switch (choice) {
    case 1: System.out.println("You have selected ADD.");
    
            break;
    case 2: System.out.println("You have selected INSERT.");
            break;
    case 3: System.out.println("You have selected DELETE.");
            break;
    case 4: System.out.println("You have selected SHOW.");
            break;
    case 5: System.out.println("You have selected COUNT.");
            break;
    case 6: System.out.println("You have selected CLEAR.");
            break;
    case 7: System.out.println("Exiting the program.");
            break;
    default: System.out.println("Invalid choice. Please try again with a digit of 1-7.");
}

        input.close();
    }
}
