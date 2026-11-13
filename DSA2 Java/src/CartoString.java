public class CartoString {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;
    CartoString(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }
    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return "My car name is "+name;
    // }
 
    @Override
    public String toString() {
        return "CartoString [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed
                + ", name=" + name + ", modelNumber=" + modelNumber + ", company=" + company + "]";
    }

    

    public static void main(String[] args) {
        CartoString swift = new CartoString(4, 2, 220, "Swift", "SW", "maruti");
        System.out.println(swift);
    }
}