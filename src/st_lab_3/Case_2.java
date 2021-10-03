package st_lab_3;


public class Case_2 {
    public static void main(String args[]){
        Engine kiaEngine = new Engine(120.0, "Kia");
        Car car1 = new CityCar("Kia", 1200.0, kiaEngine);
        car1.start();
        car1.turnLeft();
        car1.turnRight();
        car1.stop();
        car1.printInfo();
        Engine volvoEngine = new Engine(600.0, "Volvo");
        Car car2 = new Lorry("Volvo", 9000.0, volvoEngine, 100000.0);
        car2.start();
        car2.turnLeft();
        car2.turnRight();
        car2.stop();
        car2.printInfo();
        Engine f20c = new Engine(247.0, "Honda");
        Car car3 = new SportCar("Honda", 1250.0, f20c, 240.0);
        car3.start();
        car3.turnLeft();
        car3.turnRight();
        car3.stop();
        car3.printInfo();
    }
}