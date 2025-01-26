/**
 * Jacob Whitney
 * Software Development I
 * January 26, 2025
 * TestPatron.java
 * Stores methods for testing the Patron class.
 */
public class TestPatron {
    /**
     * method: testCon
     * parameters: none
     * return: Patron object
     * purpose: test that Patron constructor is working as expected
     */
    public static Patron testCon() {
        return new Patron(
                "123",
                "jim part",
                "123 address",
                65.22
        );
    }

    /**
     * method: testGetSet
     * parameters: patron
     * return: none
     * purpose: test Patron class getters and setters
     */
    public static void testGetSet(Patron patron) {
        System.out.println(patron.getID());
        System.out.println(patron.getName());
        System.out.println(patron.getAddress());
        System.out.println(patron.getFines());
        System.out.println();

        patron.setID("456");
        System.out.println(patron.getID());

        patron.setName("dim mart");
        System.out.println(patron.getName());

        patron.setAddress("789 place");
        System.out.println(patron.getAddress());

        patron.setFines(123.50);
        System.out.println(patron.getFines());
    }

    /**
     * method: testDelete
     * parameters: patron
     * return: none
     * purpose: test deleting a patron object
     */
    public static void testDelete(Patron patron) {
        System.out.println(patron.getID());
        System.out.println(patron.getName());
        System.out.println(patron.getAddress());
        System.out.println(patron.getFines());
        patron = null;

        if (patron == null) System.out.println("Object is deleted");
    }

    /**
     * method: testPrintObject
     * parameters: patron
     * return: none
     * purpose: test printing a Patron object
     */
    public static void testPrintObject(Patron patron) {

    }
}
