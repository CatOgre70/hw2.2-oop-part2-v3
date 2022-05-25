public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Орлёнок", 2);
        Car car = new Car("лада Калина", 4);
        Truck truck = new Truck("Камаз", 8);

        ServiceStation serviceStation = new ServiceStation();
        System.out.println("bicycle = " + bicycle);
        serviceStation.check(bicycle);
        System.out.println("car = " + car);
        serviceStation.check(car);
        System.out.println("truck = " + truck);
        serviceStation.check(truck);
    }
}