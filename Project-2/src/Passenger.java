public abstract class Passenger {

    private String name;
    private String ID;
    protected double tripCost;
    protected Car reservedCar;



    public Passenger(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public abstract void reserveCar(Car car) throws Exception;

    public void displayInfo(){
        System.out.println("Passenger Name: " +name+ "\nPassenger ID: " + ID + "\nCar Code: " + reservedCar.getCode() +" | Route Price: SAR " + reservedCar.getRoute().getTripPrice() + "\nTrip Cost: SAR " + tripCost );
    }

}
