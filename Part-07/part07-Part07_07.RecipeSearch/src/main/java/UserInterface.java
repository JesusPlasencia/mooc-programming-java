import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scan) {
        this.scanner = scan;
        this.recipes = new ArrayList<>();
    }

    public void start () {
        
        loadRecipes(getFileName());
        
        while (true) {
            menu ();
            System.out.println("Enter command: ");
            String cmd = scanner.nextLine();
            
            if (cmd.equals("list")) {
                System.out.println("");
                printRecipes();
            }
            else if (cmd.equals("stop")) {
                break;
            }
            else if (cmd.equals("find name")) {
                System.out.println("");
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("");
                searchByName(word);
            }
            else if (cmd.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                searchByTime(time);
            }
            else if (cmd.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                searchByIngredient(ingredient);
            }
        }
    }
    
    private void menu() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }
    
    private void printRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    private void searchByName (String word) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }
    
    private void searchByTime (int time) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
    }
    
    private void searchByIngredient (String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
    private void loadRecipes(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            Recipe currentRecipe = null;
            boolean isFirstLine = true;
            boolean isSecondLine = false;
            
            while ((line = reader.readLine()) != null) {
            if (line.isBlank()) {
                if (currentRecipe != null) {
                    addRecipe(currentRecipe);
                    currentRecipe = null;
                    isFirstLine = true;
                }
            } else {
                if (isFirstLine) {
                    currentRecipe = new Recipe(line, 0);
                    isFirstLine = false;
                    isSecondLine = true;
                } else if (isSecondLine) {
                    if (currentRecipe != null) {
                        currentRecipe.setCookingTime(Integer.parseInt(line));
                        isSecondLine = false;
                    }
                } else if (currentRecipe != null) {
                    currentRecipe.addIngredient(line);
                }
            }
        }

        if (currentRecipe != null) {
            addRecipe(currentRecipe);
        }

            reader.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
    
    private String getFileName() {
        System.out.println("File to read: ");
        return scanner.nextLine();
    }

    private void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    
}
