import jdk.jfr.Category;

import java.util.Scanner;

public class Operation {
    private Type type;
    private Category category;
    private String name;
    private float amount;

    private enum Type {
        EXPENSE,
        INCOME
    }

    private enum Category {
//        INCOME
        SALARY,
        SAVINGS,
        PASSIVE_EARNINGS,
//        EXPENSES
        RENT,
        FOOD_GROCERY_TAKE_OUT,
        CLOTHES,
        TAXES,
        SERVICES,
        ENTERTAINMENT,
        ONLINE_PLATFORMS,
        HEALTH_INSURANCE,
        GYM_SPORT,
        MISCELLANE0US,
    }

    public Operation(Type type, String name, float amount, Category category) {
        this.type = type;
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
        Type type;
        if (stepType == 1) {
            type = Type.EXPENSE;
        } else {
            type = Type.INCOME;
        }

//        while y control flow for errors/exceptions - trycatch
        System.out.println("Creating new " + type.name());
        System.out.println("Enter " + type.name() + "name:");
        String name = scanner.nextLine();
        System.out.println("Enter " + type.name() + "amount:");
        float amount = scanner.nextFloat();
        System.out.println("Enter " + type.name() + "category:");
//        log possible categories
        String category = scanner.nextLine().toUpperCase();

        return new Operation(type, name, amount, Category.valueOf(category));
    }

    public void show(int stepType) {

    }

}
