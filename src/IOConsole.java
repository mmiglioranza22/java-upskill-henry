import java.util.Date;
import java.util.Scanner;

public class IOConsole {
    private final Date date;
    private final Scanner scanner;
    private int option;

    public IOConsole() {
        this.date = new Date();
        this.scanner = new Scanner(System.in);
        this.option = 0;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return this.option;
    }
    public void start() {
        System.out.println("Welcome to your expenses tracker.");
        System.out.println("""
            Please select one of the following options:
            1 - Enter new expense
            2 - Enter new income
            3 - Show expenses
            4 - Show income
            5 - Exit""");

        do {
            int pick = scanner.nextInt();
            this.evaluateOption(pick);

        } while (this.getOption() != 5);

        System.out.println("Bye");

    }

    private void evaluateOption(int pick) {
        System.out.println("Picked option: " + pick);
        this.setOption(pick);

        switch (this.getOption()) {
            case 1:
                System.out.println('1');
                break;
            case 2:
                System.out.println('2');
                break;
            case 3:
                System.out.println('3');
                break;
            case 4:
                System.out.println('4');
                break;
            case 5:
                System.out.println('5');
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

    }


}
