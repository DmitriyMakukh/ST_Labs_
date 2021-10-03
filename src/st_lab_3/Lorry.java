package st_lab_3;


public class Lorry extends Car{
    double maxWeight;
    public Lorry(String mark,double weight, Engine engine, double maxWeight){
        this.mark=mark;
        this.weight=weight;
        this.engine=engine;
        this.kind="Lorry";
        this.maxWeight=maxWeight;
    }
    public void printInfo(){
        System.out.println("Mark: " + mark + "\nClass: " + kind + "\nWeight(kg): " + weight + "\nEngine power(hp): " + engine.power
                + "\nEngine manufacturer: " + engine.manufacturer + "\nMax weight(kg): " + maxWeight);
    }
}