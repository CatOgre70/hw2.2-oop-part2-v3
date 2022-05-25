public class Vehicle implements Service{
    String modelName;
    int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public void doService(){
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre(i + 1);
        }
    }

    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }

    public void updateTyre(int i){
        System.out.println("Меняем покрышку " + i + " из " + getWheelsCount());
    }

}
