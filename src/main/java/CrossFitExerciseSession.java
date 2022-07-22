public class CrossFitExerciseSession implements ExerciseSession{
    @Override
    public Exercise getExercise() {
        return new CrossFit();
    }

    @Override
    public Equipment getEquipment() {
        return new AllSportEquipment();
    }
}
