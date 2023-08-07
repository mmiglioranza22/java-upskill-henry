import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Expense> expenses = new ArrayList<>();
        ArrayList<Income> earnings = new ArrayList<>();
        Balance balance = new Balance(expenses, earnings);

        IOConsole console = new IOConsole(balance);

        console.start();
    }
}