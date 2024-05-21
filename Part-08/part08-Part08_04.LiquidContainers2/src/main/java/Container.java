public class Container {

    private int liquid;

    public Container() {
        liquid = 0;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        // Scenario: Dont do anything if amount is negative
        if (amount < 0) {
            return;
        }
        // Scenario: If in previous adding you reached 100, this prevents you from adding again
        if (liquid == 100) {
            return;
        }
        // Scenario: Adding liquid
        liquid = liquid + amount;
        // Scenario: Check if after adding liquid surpassed 100
        if (liquid >= 100) {
            liquid = 100;
        }
    }

    public void remove(int amount) {
        // Scenario: If Liquid is 0, it does not make sense to remove some liquid from container
        if (liquid == 0) {
            return;
        }
        // Scenario: There is some liquid in container, but the amount requested to remove if more or equal than the current capacity
        if (amount >= liquid) {
            liquid = 0;
            return;
        }
        // Scenario: Any other case when liquid is more than quantity to remove
        liquid = liquid - amount;
    }

    @Override
    public String toString() {
        return liquid + "/100";
    }
}
