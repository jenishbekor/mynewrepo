public class Car {
    // properties
    String color;
    private String brand;
    private String model;
    public int year;

    // constructor
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.   year = year;

    }

    //methods
    public void displayInfo(){
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Car year: "+ year);
    }


    public String toString(){
        return "Brand: " + this.brand + ", Model: "+ this.model + ", Year: "+this.year;
    }

}
