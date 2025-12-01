public abstract class CoffeeDecorator implements Coffee {
    private Coffee wrappedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    public String getDescription() {
        return wrappedCoffee.getDescription();
    }

    public double getCost() {
        return wrappedCoffee.getCost();
    }
}