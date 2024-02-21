package ch19;

public class CarFactory {

    private static CarFactory instance = new CarFactory();
    private int carNum = 10000;

    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {	
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        return new Car(++carNum);
    }
}