
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    
    public Recipe(String name, int cooking) {
        this.name = name;
        this.cookingTime = cooking;
        this.ingredients = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
