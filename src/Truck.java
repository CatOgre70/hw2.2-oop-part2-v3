public class Truck extends Vehicle implements Service{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void doService(){
        super.doService();
        checkTrailer();
    }

    private void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

}
