public class GymSession implements ExerciseSession{
    @Override
    public Exercise getExercise() {
        return new Gym();
    }

    @Override
    public Equipment getEquipment() {
        return new Weights();
    }
}
