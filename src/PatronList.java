import java.util.Scanner;

/**
 * Jacob Whitney
 * Software Development I
 * January 26, 2025
 * PatronList.java
 * Manages a list of existing patrons, including
 * printing the list and adding and deleting patrons.
 */
public class PatronList {
    // Print patron list
    /**
     * method: printPatronList
     * parameters: count, list
     * return: none
     * purpose: Print details of all existing patrons
     * in LMS
     */
    public static void printPatronList(int count, Patron[] list) {
        System.out.println("          Patron List           ");
        System.out.println("--------------------------------");
        for (int i = 0; i < count; i++) {
            list[i].printDetails();
        }
    }
    // end Print patron list

    // Add a single patron via user input
    /**
     * method: printAddPatronInstr
     * parameters: none
     * return: none
     * purpose: Print instructions for user entering
     * new patron data
     */
    public static void printAddPatronInstr() {
        System.out.println("---------------------------------");
        System.out.println("To enter a new patron record,");
        System.out.println("use the format 'ID-Name-Address-Fines'.");
        System.out.println();
        System.out.println("The ID must be a 7-digit number.");
        System.out.println("The fines cannot be less than 0 or more than 250.");
        System.out.println("Do not enter dollar signs or other symbols. Numbers and decimal only.");
        System.out.println("Example: 1234567-John Smith-123 Central Blvd, Orlando, FL 32801-50.25");
        System.out.println();
        System.out.print("Enter the new patron record here: ");
    }

    /**
     * method: validateID
     * parameters: id
     * return: none
     * purpose: Confirm ID is 7-digit number
     */
    public static boolean validateID(String id) {
        int length = id.length();
        if (length != 7) return false;
        else return true;
    }

    /**
     * method: validateFines
     * parameters: fines
     * return: none
     * purpose: Confirm fines are at least 0 and at most 250
     */
    public static boolean validateFines(double fines) {
        if (fines < 0 || fines > 250) return false;
        else return true;
    }


    /**
     * method: userAddPatron
     * parameters: none
     * return: patronArr
     * purpose: Queries user input to create a new Patron object
     */
    public static String[] userAddPatron() {
        String id = "";
        String name = "";
        String address = "";
        Double fines = 0.0;

        Scanner reader = new Scanner(System.in);
        String newPatron = reader.nextLine();
        System.out.println();

        // Parse user input
        String[] patronArr = newPatron.split("-");
        return patronArr;
    }
    // end Add a single patron via user input

}
