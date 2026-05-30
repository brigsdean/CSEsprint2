import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a single expense entry in the expense tracker.
 * This class demonstrates encapsulation by keeping fields private
 * and providing getters and setters.
 */

public class Expense {
    private String description;
    private double amount;
    private String category;
    private final LocalDate date;
    
    /**
     * Constructor that creates an expense with today's date
     */

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = LocalDate.now();
    }
    /**
     * Overloaded constructor that allows specifying a custom date
     */
    public Expense(String description, double amount, String category, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }
    
    // Getters
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public LocalDate getDate() { return date; }
    
    // Setters
    public void setDescription(String description) { this.description = description; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setCategory(String category) { this.category = category; }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return String.format("%-15s | $%-8.2f | %-12s | %s", 
                           description, amount, category, date.format(formatter));
    }
}