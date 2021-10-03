package st_lab_3;

public abstract class Car {
    String mark, kind;
    double weight;
    Engine engine;
    public void start(){
        System.out.println(kind + " " + mark + " was started");
    }
    public void stop(){
        System.out.println(kind + " " + mark + " was stopped");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void printInfo(){
        System.out.println("Mark: " + mark + "\nClass: " + kind + "\nWeight(kg): " + weight + "\nEngine power(hp): " + engine.power
                + "\nEngine manufacturer: " + engine.manufacturer);
    }
}