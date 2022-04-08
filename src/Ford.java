public class Ford extends Car implements usefulMethods{


    public Ford(int wheels, String slogan) {
        super(wheels, slogan);
    }

    @Override
    public void numberOfGears() {
        System.out.println("Has 4 gears.");
    }

    @Override
    public String allAboutCar() {
        return super.allAboutCar();
    }
}
