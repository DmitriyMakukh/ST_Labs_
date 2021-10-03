package st_lab_3;

public class Case_1 {
    public static void main(String args[]){
        Flower flower1 = new Rose();
        System.out.println("Rose: " + flower1.getPrice());
        Flower flower2 = new Carnation();
        System.out.println("Carnation: " + flower2.getPrice());
        Flower flower3 = new Tulip();
        System.out.println("Tulip: " + flower3.getPrice());
        Flower flower4 = new Daffodil();
        System.out.println("Daffodil: " + flower4.getPrice());
        Flower flower5 = new Chrysanthemum();
        System.out.println("Chrysanthemum: " + flower5.getPrice());

        Flower f1 = new Rose();
        Flower f2 = new Tulip();
        Flower f3 = new Chrysanthemum();

        Flower f4 = new Rose();
        Flower f5 = new Tulip();
        Flower f6 = new Rose();
        Flower f7 = new Carnation();
        Flower f8 = new Rose();

        Flower f9 = new Rose();
        Flower f10 = new Carnation();
        Flower f11 = new Tulip();
        Flower f12 = new Daffodil();
        Flower f13 = new Chrysanthemum();

        Flower[] buket1 = {f1,f2,f3};
        Flower[] buket2 = {f4,f5,f6,f7,f8};
        Flower[] buket3 = {f9,f10,f11,f12,f13};

        System.out.println("Buket1: " + Flower.getBuketPrice(buket1));
        System.out.println("Buket2: " + Flower.getBuketPrice(buket2));
        System.out.println("Buket3: " + Flower.getBuketPrice(buket3));

        Flower[][] bukets = {buket1, buket2, buket3};
        System.out.println("Flower count in all bukets: " + Flower.getFlowerCount(bukets));

    }
}