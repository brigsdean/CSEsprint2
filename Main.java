/**
 * Entry point of the Expense Tracker application.
 * This class follows the standard Java convention of having
 * a main method to start the program.
 */


public class Main {

    /**
     * Main method - creates an ExpenseTracker object and starts the application
     */
    
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.run();
    }
}