import java.util.ArrayList;
import java.util.List;

public class ExerciseManagement {

    private List<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public void add(String name) {
        this.exercises.add(new Exercise(name));
    }

    public void markAsCompleted(String name) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(name)) {
                ex.markAsCompleted();
                break;
            }
        }
    }

    public List<String> exerciseList() { // Renamed from getExercises()
        List<String> list = new ArrayList<>();
        for (Exercise ex : exercises) {
            if (!ex.isCompleted()) {
                list.add(ex.getName());
            }
        }
        return list;
    }

    public List<String> getCompleted() {
        List<String> list = new ArrayList<>();
        for (Exercise ex : exercises) {
            if (ex.isCompleted()) {
                list.add(ex.getName());
            }
        }
        return list;
    }

    public boolean isCompleted(String name) { 
        for (Exercise ex : exercises) {
            if (ex.getName().equals(name)) {
                return ex.isCompleted();
            }
        }
        return false; 
    }
}