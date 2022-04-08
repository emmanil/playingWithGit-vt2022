public class Ford extends Car implements usefulMethods{


    public Ford(int wheels) {
        super(wheels);
    }


    @Override
    public void numberOfGears() {
        System.out.println("Has 4 gears.");
    }
}
