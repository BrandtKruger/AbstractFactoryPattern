/*
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as
factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the
best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly
specifying their classes. Each generated factory can give the objects as per the Factory pattern.
 */


public class main {

    public static void main(String[] args){

        var factory = new GymSession();
        Exercise exercise = factory.getExercise();
        exercise.doExercise();
        Equipment equipment = factory.getEquipment();
        equipment.equipmentUsed();

        var factory1 = new CrossFitExerciseSession();
        Exercise exercise1 = factory1.getExercise();
        exercise1.doExercise();
        Equipment equipment1 = factory1.getEquipment();
        equipment1.equipmentUsed();

        var factory2 = new JogSession();
        Exercise exercise2 = factory2.getExercise();
        exercise2.doExercise();
        Equipment equipment2 = factory2.getEquipment();
        equipment2.equipmentUsed();
        
    }
}
