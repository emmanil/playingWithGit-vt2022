public class Car {

    private int wheels = 4;
    private String slogan;

    public Car(int wheels, String slogan) {
        this.wheels = wheels;
        this.slogan = slogan;
    }


    public String allAboutCar(){

        return getClass().getSimpleName() + " has slogan "+ slogan;
    }
}
