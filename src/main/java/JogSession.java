public class JogSession implements ExerciseSession{
    @Override
    public Exercise getExercise() {
        return new Jog();
    }

    @Override
    public Equipment getEquipment() {
        return new Shoes();
    }
}
