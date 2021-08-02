package HomeWork4_2;

public class Сandies extends Sweet{

    private String filling;

    public Сandies() {}

    public Сandies(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Сandies{" + super.toString()+
                " начинка='" + filling + '\''+ "}";
    }
}
