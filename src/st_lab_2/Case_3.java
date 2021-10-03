package st_lab_2;

public class Case_3 {

    public static void main (String args[]){
        Phone phone1 = new Phone("+7 (906) 455-12-05","iPhone",140.0);
        Phone phone2 = new Phone("+7 (666) 477-12-05","Samsung");
        Phone phone3 = new Phone();
        Phone[] phones = {phone1, phone2, phone3};
        for(Phone p:phones){
            System.out.println("Model: " + p.model + "\nNumber: " + p.number + "\nWeight: " + p.weight + "\n");
        }
        phone1.receiveCall("Ivan");
        phone2.receiveCall("Olga");
        phone3.receiveCall("Petr\n");
        for(Phone p:phones){
            System.out.println(p.getNumber());
        }
        phone1.receiveCall("Ivan", "+7 (999) 383-11-22");
        phone2.receiveCall("Olga", "+7 (985) 555-55-55");
        phone3.receiveCall("Petr", "+7 (345) 345-34-35\n");

        Phone.sendMessage("Hello, World!", "+7 (999) 383-11-22", "+7 (985) 555-55-55", "+7 (345) 345-34-35");
    }
}