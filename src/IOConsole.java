import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class IOConsole {
    private final Scanner scanner;
    private int option;
    private final Balance balance;

    enum Type {
        EXPENSE,
        INCOME
    }

    public IOConsole(Balance balance) {
        Date date = new Date();
        this.scanner = new Scanner(System.in);
        this.option = 0;
        this.balance = balance;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return this.option;
    }

    public void start() {
        System.out.println("Welcome to your expenses tracker.");
        do {
            System.out.println("""
                Please select one of the following options:
                1 - Enter new expense
                2 - Enter new income
                3 - Show expenses
                4 - Show income
                5 - Exit""");
            int pick = scanner.nextInt();
            this.setOption(pick);
            Operation operation = this.evaluateOption(pick);
            this.balance.process(operation, pick);
        } while (this.getOption() != 5);
        System.out.println("Bye");
    }

    private Operation evaluateOption(int pick) {
        System.out.println("Picked option: " + pick);
        Operation operation = null;

        switch (this.getOption()) {
            case 1:
            case 2:
                operation = Operation.create(this.getScanner(), this.getOption());
            case 3:
            case 4:
                if (operation != null) {
                    operation.show(this.getOption());
                } else {
                    System.out.println("Impossible operation.");
                }
                break;
            case 5:
                System.out.println('5');
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        return operation;
    }


}
