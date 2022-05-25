public class Car extends Vehicle{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void doService(){
        super.doService();
        checkEngine();
    }

    private void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

}
