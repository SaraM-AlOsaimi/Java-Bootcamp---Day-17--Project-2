public class NonSubscribersPassengers extends Passenger{

    boolean discountCoupon = true;

  // Non-Subscribers passengers: have boolean value named discount coupon
  //and gets a 10% discount on the trip cost if they have it.


    public NonSubscribersPassengers(String ID, String name, boolean discountCoupon) {
        super(ID, name);
        this.discountCoupon =discountCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacityPerTrip() == 0){
            throw new Exception("Car is full, sorry can't reserve a seat");
        }
        this.reservedCar = car;
        if(discountCoupon){
            this.tripCost = car.getRoute().getTripPrice() * 0.90;
        } else
            this.tripCost = car.getRoute().getTripPrice() ;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Non-Subscribers passengers (Discount 10%) applied : " + ((discountCoupon) ? "Yes!" : "No"));
    }

}
