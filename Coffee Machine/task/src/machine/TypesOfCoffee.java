package machine;

public enum TypesOfCoffee {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    int waterRation;
    int milkRation;
    int coffeeBeanRation;
    int price;

    TypesOfCoffee(int waterRation, int milkRation, int coffeeBeanRation, int price) {
        this.waterRation = waterRation;
        this.milkRation = milkRation;
        this.coffeeBeanRation = coffeeBeanRation;
        this.price = price;
    }

    public int getWaterRation() {
        return waterRation;
    }

    public int getMilkRation() {
        return milkRation;
    }

    public int getCoffeeBeanRation() {
        return coffeeBeanRation;
    }

    public int getPrice() {
        return price;
    }
}
