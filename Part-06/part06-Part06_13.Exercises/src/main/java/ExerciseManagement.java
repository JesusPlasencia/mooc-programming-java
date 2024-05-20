
import java.util.ArrayList;


public class ExerciseManagement {

    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement () {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise ex : exercises) {
            list.add(ex.getName());
        }
        return list;
    } 
 
    public void add (String nameExercise) {
        this.exercises.add(new Exercise(nameExercise));
    }
    
    public void markAsCompleted (String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName() == exercise) {
                ex.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted (String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName() == exercise) {
                return ex.isCompleted();
            }
        }
        return false;
    }
    
}
