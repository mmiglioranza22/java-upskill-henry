import java.util.Scanner;

public class Operation {
    private Type type;
    private String name;
    private float amount;

    enum Type {
        EXPENSE,
        INCOME
    }

    public Operation(Type type, String name, float amount) {
        this.type = type;
        this.name = name;
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public static Operation create(Scanner scanner, int stepType) {

        System.out.println("Creating new " + );

        System.out.println("Enter");
        String name = scanner.nextLine();
        System.out.println("New expense - Type?");
        String type = scanner.nextLine();
        System.out.println("New expense - Type?");
        float amount = scanner.nextFloat();

        return Operation.step(stepType, scanner);
    }

    public void show(int stepType) {

    }

}
