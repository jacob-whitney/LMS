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
        // Tests (to be removed)
        Patron jim = TestPatron.testCon();
        TestPatron.testGetSet(jim);
        TestPatron.testDelete(jim);
    }
}
