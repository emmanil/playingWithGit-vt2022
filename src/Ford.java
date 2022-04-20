public class Ford extends Car implements DetailsAboutCar {


    public Ford(int wheels, String slogan, String hasTheThemesong) {
        super(wheels,
                slogan,
                hasTheThemesong);
    }

    public void numberOfGears() {
        System.out.println("Has 4 gears.");
    }


    public String theCarsSlogan() {
        return getClass().getName() + " has the slogan "+ getSlogan();
    }


    public String theCarsThemesong() {
        return getClass().getName() + " has the themesong "+ getThemesong();
    }
}
