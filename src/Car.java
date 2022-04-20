public class Car {

    private int wheels = 4;
    private String slogan;
    private String hasTheThemesong;


    public Car(int wheels, String slogan, String hasTheThemesong) {
        this.wheels = wheels;
        this.slogan = slogan;
        this.hasTheThemesong = hasTheThemesong;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getThemesong() {
        return hasTheThemesong;
    }

    public void setThemesong(String hasTheThemesong) {
        this.hasTheThemesong = hasTheThemesong;

    }

     public String allAboutCar(){
        return (getClass().getName() + " has slogan "+ slogan);
    }
}
