package fitness;


import lombok.Data;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@Data
public class WorkoutProgram {
    private String name;
    private Map<DayOfWeek, List<Exercise>> workoutProgramExercises;

    public WorkoutProgram(String name, Map<DayOfWeek, List<Exercise>> workoutProgramExercises) {
        this.name = name;
        this.workoutProgramExercises = workoutProgramExercises;
    }
}
