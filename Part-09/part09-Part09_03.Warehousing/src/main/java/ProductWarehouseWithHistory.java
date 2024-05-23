public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }
    
    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        // Impact first in Warehouse
        double taken = super.takeFromWarehouse(amount);
        // Persist change of balance in list
        this.history.add(super.getBalance());
        return taken;
    }
    
    public void printAnalysis () {
        System.out.println("Product: " + super.getName() + "\n" +
                           "History: " + history() + "\n" +
                           "Largest amount of product: " + this.history.maxValue() + "\n" +
                           "Smallest amount of product: " + this.history.minValue() + "\n" +
                           "Average: " + this.history.average()); 
    }
}
