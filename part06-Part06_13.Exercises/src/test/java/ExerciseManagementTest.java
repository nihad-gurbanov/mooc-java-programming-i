import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }

    @Test
    public void exerciseListInitiallyEmpty() {
        assertEquals(0, management.exerciseList().size()); // Updated to exerciseList()
    }

    @Test
    public void addedExerciseIsFoundInList() {
        management.add("math");
        assertTrue(management.exerciseList().contains("math")); 
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("english");
        management.markAsCompleted("english");
        assertTrue(management.isCompleted("english")); 
    }

    @Test
    public void completedExerciseNotInUncompletedList() {
        management.add("physics");
        management.markAsCompleted("physics");
        assertFalse(management.exerciseList().contains("physics")); 
    }
}