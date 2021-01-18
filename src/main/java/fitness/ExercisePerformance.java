package fitness;

import lombok.Data;

import java.util.Date;

@Data
public class ExercisePerformance {
    private String exerciseId;
    private int sets;
    private int reps;
    private double maxWeight;
    private Date performedAt;

    public ExercisePerformance(String exerciseId, int sets, int reps, double maxWeight, Date performedAt) {
        this.exerciseId = exerciseId;
        this.sets = sets;
        this.reps = reps;
        this.maxWeight = maxWeight;
        this.performedAt = performedAt;
    }
}
