/**
 * Jacob Whitney
 * Software Development I
 * January 26, 2025
 * TestPatronList.java
 * Stores methods for testing PatronList methods.
 */
public class TestPatronList {
    /**
     * method: testUserAddPatron
     * parameters: none
     * return: none
     * purpose: test userAddPatron method
     */
    public static void testUserAddPatron() {
        String[] newPatron = PatronList.userAddPatron();
        for (int i = 0; i < newPatron.length; i++) {
            System.out.println(newPatron[i]);
        }
    }
}
