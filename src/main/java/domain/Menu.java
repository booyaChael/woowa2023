//Menu.java
package domain;

public class Menu {
    private final int number;
    private final String name;
    private final Category category;
    private final int price;

    public Menu(final int number, final String name, final Category category, final int price) {
        this.number = number;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return category + " " + number + " - " + name + " : " + price + "원";
    }

    public int getNumber(){
        return this.number;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice() { return this.price; }

    public Category getCategory() { return this.category; }
}
