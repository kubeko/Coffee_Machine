package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final Scanner scanner = new Scanner(System.in);
    private static int waterAmount = 400;
    private static int milkAmount = 540;
    private static int coffeeBeanAmount = 120;
    private static int cupAmount = 9;
    private static int moneyAmount = 550;

    public static void main(String[] args) {
        action();
    }

    public static void action() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String act = scanner.next();
        switch (act) {
            case "buy":
                buyAction();
                action();
                break;
            case "fill":
                fillAction();
                action();
                break;
            case "take":
                takeMoneyAction();
                action();
                break;
            case "remaining":
                remainingAction();
                action();
                break;
            case "exit":
                System.exit(0);
            default:
                System.out.println("Incorrect input, please try again.");
                action();
                break;
        }
    }

    public static void buyAction() {
        String message = "\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:";
        System.out.println(message);
        switch (scanner.next()) {
            case "1":
                counter(TypesOfCoffee.ESPRESSO, 1);
                break;
            case "2":
                counter(TypesOfCoffee.LATTE, 1);
                break;
            case "3":
                counter(TypesOfCoffee.CAPPUCCINO, 1);

                break;
            case "back":
                action();
                break;
            default:
                System.out.println("Incorrect input, please try again.");
                buyAction();

        }
    }

    public static void counter(TypesOfCoffee typesOfCoffee, int quantity) {
        int waterPortion = waterAmount / (typesOfCoffee.getWaterRation() * quantity);
        int milkPortion;
        if (typesOfCoffee.getMilkRation() == 0) {
            milkPortion = milkAmount / quantity;
        } else {
            milkPortion = milkAmount / (typesOfCoffee.getMilkRation() * quantity);
        }
        int beanPortion = coffeeBeanAmount / (typesOfCoffee.getCoffeeBeanRation() * quantity);
        int cupsPortion = cupAmount / quantity;

        int availableCoffee = Math.min(Math.min(waterPortion, milkPortion), Math.min(beanPortion, cupsPortion));
        String s = "water, milk, coffee beans, disposable cups";
        if (availableCoffee != waterPortion) {
            s = s.replace("water, ", "");
        }
        if (availableCoffee != milkPortion) {
            s = s.replace("milk, ", "");
        }
        if (availableCoffee != beanPortion) {
            s = s.replace("coffee beans, ", "");
        }
        if (availableCoffee != cupsPortion) {
            s = s.replace("disposable cups", "");
        }
        s = s.trim();
        if (s.endsWith(",")) {
            s = s.substring(0, s.length() - 1);
        }
        if (s.contains(",")) {
            StringBuilder tempS = new StringBuilder(s);
            tempS.insert(tempS.lastIndexOf(","), " and");
            tempS.deleteCharAt(tempS.lastIndexOf(","));
            s = String.valueOf(tempS);
        }

        if (quantity <= availableCoffee) {
            waterAmount -= typesOfCoffee.getWaterRation() * quantity;
            milkAmount -= typesOfCoffee.getMilkRation() * quantity;
            coffeeBeanAmount -= typesOfCoffee.getCoffeeBeanRation() * quantity;
            cupAmount -= quantity;
            moneyAmount += typesOfCoffee.getPrice() * quantity;
            System.out.println("I have enough resources, making you a coffee!\n");
        } else System.out.println("Sorry, not enough " + s + "!\n");
        // else System.out.println("Sorry, not " + availableCoffee + " cup(s) of coffee");
    }
/*
    public static void espresso(int quantity) {
        int waterEspressoRation = 250;
        int milkEspressoRation = 0;
        int coffeeEspressoBeanRation = 16;
        int moneyPriceEspresso = 4;
        counter(waterEspressoRation, milkEspressoRation, coffeeEspressoBeanRation, moneyPriceEspresso, quantity);
    }

    public static void latte (int quantity) {
        int waterLateRation = 350;
        int milkLatteRation = 75;
        int coffeeBeanLateRation = 20;
        int moneyPriceLatte = 7;
        counter(waterLateRation, milkLatteRation, coffeeBeanLateRation, moneyPriceLatte, quantity);
    }

    public static void cappuccino(int quantity) {
        int waterCappuccinoRation = 200;
        int milkCappuccinoRation = 100;
        int coffeeBeanCappuccinoRation = 12;
        int moneyPriceCappuccino = 6;
        counter(waterCappuccinoRation, milkCappuccinoRation, coffeeBeanCappuccinoRation, moneyPriceCappuccino, quantity);
    }*/

    public static void fillAction() {
        System.out.println("\nWrite how many ml of water do you want to add:");
        waterAmount += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milkAmount += scanner.nextInt();

        System.out.println("Write how many grams of coffee do you want to add:");
        coffeeBeanAmount += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee beans do you want to add:");
        cupAmount += scanner.nextInt();
        System.out.println("");
    }

    public static void takeMoneyAction() {
        System.out.println("\nI gave you $" + moneyAmount + "\n");
        moneyAmount = 0;
    }

    public static void remainingAction() {
        System.out.println("\nThe coffee machine has:\n" +
                waterAmount + " of water\n" +
                milkAmount + " of milk\n" +
                coffeeBeanAmount + " of coffee beans\n" +
                cupAmount + " of disposable cups\n" +
                "$" + moneyAmount + " of money\n");
    }
}

/*    public static void ingredientRequest() {
        System.out.println("Write how many ml of water the coffee machine has:");
        waterAmount += scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        milkAmount += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeBeanAmount += scanner.nextInt();
    }*/
/*
    public static void userCoffeeRequest() {
        System.out.println("Write how many cups of coffee you will need:");
        int numberRequest = scanner.nextInt();
        int validAmount = availableCupOfCoffee(waterAmount, milkAmount, coffeeBeanAmount);
        String requestApproved = "Yes, I can make that amount of coffee";
        if (numberRequest > validAmount) {
            System.out.println("No, I can make only " + validAmount + " cup(s) of coffee");
        } else if (numberRequest == validAmount) {
            System.out.println(requestApproved);
        } else {
            System.out.println(requestApproved + " (and even " + (validAmount - numberRequest) + " more than that)");
        }
    }*/


/*
    private static int availableCupOfCoffee(int water, int milk, int coffeeBean) {
        int waterAv = water / 200;
        int milkAv = milk / 50;
        int beanAv = coffeeBean / 15;
        int availableCoffee = waterAv < milkAv ? (Math.min(waterAv, beanAv)) : (Math.min(milkAv, beanAv));
        if (availableCoffee > 0) {
            return availableCoffee;
        } else {
            return availableCoffee;
        }
    }

    public static void makeCoffee() {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
    }

 */
