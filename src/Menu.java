/**
 * Jacob Whitney
 * Software Development I
 * January 26, 2025
 * Menu.java
 * Handles menu displays and interactions
 */
public class Menu {
    /**
     * method: printHeader
     * parameters: none
     * return: none
     * purpose: Print library management system header
     */
    public static void printHeader() {
        System.out.println("---------------------------------");
        System.out.println("    Library Management System    ");
        System.out.println("---------------------------------");
        System.out.println();
    }

    /**
     * method: printMenu
     * parameters: none
     * return: none
     * purpose: Print menu of options for users to choose from.
     */
    public static void printMenu() {
        System.out.println("              Menu              ");
        System.out.println("--------------------------------");
        System.out.println("p - print list of patrons");
        System.out.println("a - add single patron");
        System.out.println("t - add multiple patrons");
        System.out.println("d - delete patron");
        System.out.println("q - quit program");
        System.out.println();
        System.out.print("Which option above would you like to use? ");
    }
}
