import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car1= new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("a", "a", 2024);
        Car car3 = new Car("b", "b", 2020);
        Car car4 = new Car("c", "c", 2019);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for(Car c: cars){
            System.out.println(c);
        }

        cars.clear();

    }
}