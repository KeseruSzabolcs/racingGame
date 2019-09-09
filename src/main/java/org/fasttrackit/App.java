package org.fasttrackit;

import org.w3c.dom.ls.LSInput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AutoVehicle autoVehicle = new AutoVehicle()
            //this is a one line comment :)
            // click pe o linie, ctrl+x sterge linia(cut)
        Engine engine = new Engine();
        engine.capacity = 1600;
        engine.manufacturer = "Renault";

         Car car = new Car(engine);
         car.setName("Dacia");
         car.setFuelLevel(60);
         car.setMileage(8.5);
         car.setMaxSpeed(180);
         car.setFuelType("Gasoline");
         car.doorCount = 5;

        //new


                 // ALT+mouse pot modifica mai multe lini ex sterge...
                //sout+enter =System.out.println();
            System.out.println(car.getName());
            System.out.println(car.getTraveledDistance());
            System.out.println(car.isRunning());

            System.out.println(car.engine);

            car.accelerate(60,1);


                //CTRL+d=douplicate line
                //CTRL+F5
                //String name=null by default
                //orice nume primeste 0
                //orice boolean primeste by default false
        Engine engine2 = new Engine();
        engine2.capacity = 2000;
        engine2.manufacturer = "VW";
        Car car2 = new Car(engine2);
            car2.setName("BMW");
            car2.setMaxSpeed(210);
            car2.setMileage(8.0);
            car2.setFuelLevel(50);
            car2.setFuelType("Petrol");
            car2.doorCount = 2;


           // car.name = "Audi";
                System.out.println("");
                System.out.println("Car2 name: "+car2.getName());
                System.out.println("Car1 name: "+car.getName());
                //concatenare (concatenation)

//             System.out.println("Static variable examples:");
//
//             //we sould only call satatic variables from the class itself (Car),
//             // Not from a variable containing an object of that class
//             car.totalCount = 1;
//
//             System.out.println("Total count in car: " + car.totalCount);
//
//
//             car2.totalCount = 12;
//
//             System.out.println("Total count in car after setting car2: " + car.totalCount);
//             System.out.println("Total count in car2: " + car2.totalCount);
//             System.out.println("Total count in Car class: " + car2.totalCount);


       // car = car2;



    }
}
