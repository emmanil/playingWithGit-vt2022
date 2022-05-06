
public class Doll {

    private String name;
    private final Haircolor haircolor;

    public enum Haircolor{
        BLONDE,
        BROWN,
        BLACK
    }

    public Doll(String name, Haircolor haircolor) {
        this.name = name;
        this.haircolor = haircolor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
