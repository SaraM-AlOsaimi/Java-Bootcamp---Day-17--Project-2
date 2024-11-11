import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        try {

            Route route1 = new Route("Riyadh", "Dammam", 500);
            Route route2 = new Route("Jeddah", "Makkah", 200);

            Car car1 = new Car("C101", 5, route1);
            Car car2 = new Car("C102", 0, route2);

            Passenger[] passengers = new Passenger[3];

            passengers[0] = new SubscribersPassengers("12345", "Sara");
            passengers[1] = new NonSubscribersPassengers("1121", "Mohammed", true);
            passengers[2] = new NonSubscribersPassengers("1356", "Fahd", false);

            System.out.println(route1.toString());
            System.out.println("------------");
            passengers[0].reserveCar(car1);
            passengers[1].reserveCar(car1);
            passengers[2].reserveCar(car1);
//          passengers[0].reserveCar(car2);


            for(Passenger passenger : passengers){
                passenger.displayInfo();
                System.out.println("---------");
            }

        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}