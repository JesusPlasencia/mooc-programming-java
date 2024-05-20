
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // Objective: adds a meal to the menu.
    // Constraint: If the meal is already on the list, it should not be added again.
    public void addMeal (String meal) {
        if (this.meals.contains(meal)) return;
        this.meals.add(meal);
    }
    
    // Objective: prints the meals.
    public void printMeals () {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }
    
    // Objective: clears the menu.
    public void clearMenu () {
        this.meals = new ArrayList<>();
    }
}
