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
            //this is a one line comment :)
            // click pe o linie, ctrl+x sterge linia(cut)
         Car car = new Car();
         car.name = "Dacia";
         car.doorCount = 5;
         car.fuelLevel = 60;
         car.fuelType = "Gasoline";
         car.maxSpeed = 180;
         car.mileage = 8.5;
        //new
         Engine engine = new Engine();
            engine.capacity = 1594;
            engine.manufacturer = "Renault";

         car.engine = engine;

                 // ALT+mouse pot modifica mai multe lini ex sterge...
                //sout+enter =System.out.println();
            System.out.println(car.name);
            System.out.println(car.traveledDistance);
            System.out.println(car.running);
                //CTRL+d=douplicate line
                //CTRL+F5
                //String name=null by default
                //orice nume primeste 0
                //orice boolean primeste by default false
        Car car2 = new Car();
            car2.name = "BMW";
            car2.doorCount = 2;
            car2.fuelLevel = 50;
            car2.fuelType = "Petrol";
            car2.maxSpeed = 210;
            car2.mileage = 8.0;

            car.name = "Audi";
                System.out.println("");
                System.out.println("Car2 name: "+car2.name);
                System.out.println("Car1 name: "+car.name);
                //concatenare (concatenation)

            car = car2;

    }
}
