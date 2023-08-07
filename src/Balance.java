import java.util.ArrayList;

public class Balance {
    public ArrayList<Expense> expenses;

    public ArrayList<Income> earnings;

    public Balance(ArrayList<Expense> expenses, ArrayList<Income> earnings) {
        this.expenses = expenses;
        this.earnings = earnings;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public ArrayList<Income> getEarnings() {
        return earnings;
    }

    public void process(Operation operation, int operationType) {}

}
