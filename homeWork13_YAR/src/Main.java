//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Сметана", 90, "Молочные продукты");
        Product prod2 = new Product(2, "Молоко", 70, "Молочные продукты");
        Product prod3 = new Product(3, "Сливки", 100, "Молочные продукты");
        Product prod4 = new Product(3, "Ряженка", 55, "Молочные продукты");

        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        System.out.println(prod3.toString());
        System.out.println(prod4.toString());

        System.out.println("rezult_1 = " + prod1.equals(prod2));
        System.out.println("rezult_2 = " + prod3.equals(prod4));

        Product[] bas1 = {prod3, prod1};
        Product[] bas2 = {prod4, prod1};
        Product[] bas3 = {prod2, prod1};

        Order order1 = new Order("Иванов", bas1);
        Order order2 = new Order("Иванов", bas3);
        Order order3 = new Order("Иванов", bas2);
        Order order4 = new Order("Иванов", bas3);

        System.out.println(order1.toString());
        System.out.println("rezult_3 = " + order1.equals(order2));
        System.out.println("rezult_4 = " + order3.equals(order4));
    }
}