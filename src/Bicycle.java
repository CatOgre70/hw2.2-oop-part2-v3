public class Bicycle extends Vehicle implements Service{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void doService(){
        super.doService();
    }

}
