public class TestPatron {
    public static void testConGetSet() {
        // Can I create Patron objects and print them?
        Patron jim = new Patron(
                "123",
                "jim part",
                "123 address",
                65.22
        );
        System.out.println(jim.getID());
        jim.setID("456");
        System.out.println(jim.getID());

        System.out.println(jim.getName());
        jim.setName("dim mart");
        System.out.println(jim.getName());

        System.out.println(jim.getAddress());
        jim.setAddress("789 place");
        System.out.println(jim.getAddress());

        System.out.println(jim.getFines());
        jim.setFines(123.50);
        System.out.println(jim.getFines());
    }

    public static void testDelete() {
        // Can I delete Patron objects
        Patron pam = new Patron(
                "123",
                "pam art",
                "123 address",
                65.22
        );
        System.out.println(pam.getID());
        System.out.println(pam.getName());
        System.out.println(pam.getAddress());
        System.out.println(pam.getFines());
        pam = null;

        System.out.println(pam.getID());
        System.out.println(pam.getName());
        System.out.println(pam.getAddress());
        System.out.println(pam.getFines());
    }
}
