package methodoverriding23;

public class Bike2 extends Vehicle{//Creating a child class

    public static void main(String[] args) {

        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
    @Override
    public void run(){
        System.out.println("Bike is running safely");}

    }

