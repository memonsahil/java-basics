package main.java.com.basics.common;

/*
* Functional Interfaces (Java 8):
* Interfaces with an abstract method.
*/
public interface Interface {
    public static final int CONSTANT = 1;

    // Abstract method
    int sum(int a, int b);

    // Default method
    default void defaultMethod(int a, int b) {
        multiply(a, b);
    }

    /*
     * Private Methods in Interfaces (Java 9):
     * Allows interfaces to have private methods.
     */
    private void multiply(int a, int b) {
        System.out.println("Private Methods in Interfaces (Java 9): " + a * b);
    }
}
