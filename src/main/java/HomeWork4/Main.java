package HomeWork4;

public class Main {
    public static void main(String[] args) {
        //выбираем подарок
        Marshmallow marshmallow1 = new Marshmallow("Зефирка1", 1, 5, "Ваниль");
        Сandies candies1 = new Сandies("Конфета1", 2,2,"Сгущенка");
        Сhocolate chocolate1 = new Сhocolate("Шоколад1", 3,3,"Молочный");
        //вывод на консоль информации о всех сладостях в подарке.
        Sweet[] box = {marshmallow1, candies1, chocolate1};
        for (Sweet someSweet:box) {
            System.out.println(someSweet.toString());
        }

        double totalSum=0;
        double totalWeight=0;
        //Поиск общего веса подарка, стоимость подарка
        for (int i = 0;i < box.length; i++) {
            totalSum = totalSum + box[i].getPrice();
            totalWeight = totalWeight + box[i].getWeight();
        }

        System.out.println("\nИтого цена: " + totalSum);
        System.out.println("Общий вес подарка: " + totalWeight);
    }
}
