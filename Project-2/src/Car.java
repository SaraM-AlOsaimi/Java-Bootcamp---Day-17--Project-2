public class Car {

    private String code;
    private int maxCapacityPerTrip;
    private final Route route ;


    public Car(String code, int maxCapacityPerTrip, Route route) {
        this.code = code;
        this.maxCapacityPerTrip = maxCapacityPerTrip;
        this.route = route;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxCapacityPerTrip() {
        return maxCapacityPerTrip;
    }

    public void setMaxCapacityPerTrip(int maxCapacityPerTrip) {
        this.maxCapacityPerTrip = maxCapacityPerTrip;
    }


    public Route getRoute() {
        return route;
    }


}
