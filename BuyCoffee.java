public class BuyCoffee {
    public static void main (String[] args) {
        Coffee order1 = new BlackCoffee();
        System.out.println(order1.getDescription());
        System.out.println("₱" + order1.getCost() + "\n");

        Coffee order2 = new Milk(order1);
        System.out.println(order2.getDescription());
        System.out.println("₱" + order2.getCost() + "\n");

        Coffee order3 = new CaramelSyrup(order2);
        System.out.println(order3.getDescription());
        System.out.println("₱" + order3.getCost() + "\n");

    }
}