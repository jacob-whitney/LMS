import java.util.Scanner;

/**
 * Jacob Whitney
 * Software Development I
 * January 26, 2025
 * LMS.java
 * Main class to manage the Library Management System,
 * allowing users to read text files with patron information, display a list
 * of patrons, display a menu for user interaction, create new patron
 * records, and remove patron records.
 */
public class LMS {
    public static void main(String[] args) {
        // Initialize variables
        int count = 0;
        Patron[] list;
        list = new Patron[100];

        Menu.printHeader();
        Menu.printMenu();

        Scanner reader = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            String input = reader.nextLine();
            switch (input) {
                case "p":
                    PatronList.printPatronList(count, list);
                    Menu.printMenu();
                    break;
                case "a":
                    // Store values of user inputted patron record
                    String id = "";
                    String name = "";
                    String address = "";
                    Double fines = 0.0;
                    int i = 0;
                    while (i < 1) {
                        PatronList.printAddPatronInstr();
                        String[] newPatron = PatronList.userAddPatron();
                        id = newPatron[0];
                        name = newPatron[1];
                        address = newPatron[2];
                        fines = Double.valueOf(newPatron[3]);
                        // Validate data
                        if (!PatronList.validateID(id)) {
                            System.out.println("Invalid ID, try again");
                            System.out.println();
                            continue;
                        }
                        if (!PatronList.validateFines(fines)) {
                            System.out.println("Invalid fines, try again");
                            System.out.println();
                        } else {
                            i = 1;
                        }
                    }

                    list[count] = new Patron(id, name, address, fines);
                    PatronList.printPatronList(count, list);

                    count++;
                    Menu.printMenu();
                    break;
                case "t":
                    System.out.print("Please enter the relative path to your text file: ");
                    input = reader.nextLine();
                    System.out.println("Upload complete!");
                    Menu.printMenu();
                    break;
                case "d":
                    System.out.println("Delete feature is a work in progress");
                    Menu.printMenu();
                    break;
                case "q":
                    System.out.println("Quitting program");
                    loop = false;
                    break;
                default:
                    System.out.println("Not a menu option, try again");
                    System.out.println();
                    Menu.printMenu();

            }
        }
    }
}
