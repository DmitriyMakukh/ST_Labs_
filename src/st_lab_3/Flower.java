package st_lab_3;


public abstract class Flower {
    double price;
    public double getPrice(){
        return price;
    }
    public static double getBuketPrice(Flower[] buket){
        Double sum=0.0;
        for(Flower f:buket){
            sum+=f.getPrice();
        }
        return sum;
    }
    public static int getFlowerCount(Flower[][] bukets){
        int count=0;
        for (Flower[] bs:bukets){
        for(Flower b:bs)
            count++;
        }
        return count;
    }
}