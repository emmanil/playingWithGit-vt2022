

public class Main {

    public static void main(String[] args) {

        Doll doll1 = new Doll("Ella", Doll.Haircolor.BLACK);

        System.out.println(doll1.getName());

        HusbandDoll husbandDoll1 = new HusbandDoll("Eric", Doll.Haircolor.BLACK);

        System.out.println(doll1.getName()+ " and "  + husbandDoll1.getName() + " adored reading books together");
    }
}
