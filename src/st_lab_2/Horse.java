package st_lab_2;


public class Horse extends Animal{
    public Horse(String food, String location, String poroda) {
        super(food, location);
        this.poroda=poroda;
        animalType="������";
    }
    String poroda;
}