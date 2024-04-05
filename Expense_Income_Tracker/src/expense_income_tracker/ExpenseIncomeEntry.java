

package expense_income_tracker;

/**
 * 
 * @mia
*/

   /*
* ExpenseIncomeEntry represents a single entry for expenses and income.
* Each entry contains a date, description,amount and type (expense or income
*/

public class ExpenseIncomeEntry{
    
    private String date;
    private String description;
    private double amount;
    private String type;// the type of the entry (expense or income)
    
    
    
    public ExpenseIncomeEntry(String date, String description, double amount, String type)
    {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.type = type;
    }
    
    public String getDate(){ return date;}
    public String getDescription(){ return description;}
    public double getAmount(){ return amount;}
    public String getType(){ return date;}


        
           
    }

