package HomeWork4_2;

public class Сhocolate extends Sweet {
    private String type;

    public Сhocolate() {}
    public Сhocolate(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Сhocolate{" + super.toString()+
                " вид='" + type + '\''+ "}";
    }
}
