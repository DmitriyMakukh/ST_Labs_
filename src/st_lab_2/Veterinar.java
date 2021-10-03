package st_lab_2;


public class Veterinar {
    public static void treatAnimal(Animal[] animals){
        for (Animal a:animals){
            System.out.println(a.food + " " + a.location);
        }
    }
}