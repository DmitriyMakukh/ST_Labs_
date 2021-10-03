package st_lab_3;


public class SportCar extends Car{
    double maxSpeed;
    public SportCar(String mark,double weight, Engine engine, double maxSpeed){
        this.mark=mark;
        this.weight=weight;
        this.engine=engine;
        this.kind="Sport Car";
        this.maxSpeed=maxSpeed;
    }
    public void printInfo(){
        System.out.println("Mark: " + mark + "\nClass: " + kind + "\nWeight(kg): " + weight + "\nEngine power(hp): " + engine.power
                + "\nEngine manufacturer: " + engine.manufacturer + "\nMax speed(km/h): " + maxSpeed);
    }
}