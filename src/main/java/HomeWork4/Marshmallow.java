package HomeWork4;

public class Marshmallow extends Sweet{

    private String flavour;

    public Marshmallow(String name, double weight, double price, String flavour) {
        super(name, weight, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Marshmallow{" + super.toString() +
                " аромат='" + flavour + '\'' + "}";
    }
}

