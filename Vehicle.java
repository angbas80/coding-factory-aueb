package gr.aueb.cf.testbed.week7;

public class Vehicle {

    static int vehicleCount = 0;
    String type;
    int releaseYear;
    int cubicCapacity;
    boolean longVehicle;

    public Vehicle() {
        vehicleCount++;
    }

    public static int getVehicleCount(){
        return vehicleCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public boolean isLongVehicle() {
        return longVehicle;
    }

    public void setLongVehicle(boolean longVehicle) {
        this.longVehicle = longVehicle;
    }

    public static void main(String[] args) {
        Vehicle ABC = new Vehicle();

        System.out.println(Vehicle.getVehicleCount());
    }

}
