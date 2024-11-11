public class SubscribersPassengers extends Passenger{

// Subscribers passengers: take 50% discount on trip cost when they reserve a
//car .


    public SubscribersPassengers(String ID, String name) {
        super(ID, name);
    }


    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacityPerTrip() == 0){
            throw new Exception("Car is full, sorry can't reserve a seat");
        }
        this.reservedCar = car;
        this.tripCost = car.getRoute().getTripPrice() * 0.5;
        }


    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subscribers passengers (Discount 50%) was applied!");
    }
}
