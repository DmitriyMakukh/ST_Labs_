package st_lab_2;

public class Dog extends Animal{
    public Dog(String food, String location, boolean isKnowCommands) {
        super(food, location);
        this.isKnowCommands = isKnowCommands;
        animalType="??????";
    }
    boolean isKnowCommands;
}