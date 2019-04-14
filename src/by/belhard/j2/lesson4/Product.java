package by.belhard.j2.lesson4;

public class Product {
    private String name;
    private Double amount;
    private Units units;
    private FreshStatus freshStatus;
    private String validDate;
    private Category category;

    public Product(String name, Double amount, Units units, FreshStatus freshStatus, String validDate, Category category) {
        this.name = name;
        this.amount = amount;
        this.units = units;
        this.freshStatus = freshStatus;
        this.validDate = validDate;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public Units getUnits() {
        return units;
    }

    public FreshStatus getFreshStatus() {
        return freshStatus;
    }

    public String getValidDate() {
        return validDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    @Override
    public String toString() {
        Main.LINE();
        return "| " + Main.padString(name, 13) + "| " +
                      Main.padString(amount.toString(),3) + " " +
                      Main.padString(units.toString(), 5) + "| " +
                      Main.padString(freshStatus.toString(),12) + "| " +
                      Main.padString(validDate,13) + "| " + category;
    }

}
