import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order (String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString(){
        return "Покупатель " + this.customer + ", корзина " + Arrays.toString(this.basket);
    }

    @Override
    public boolean equals(Object Obj){
        if (this == Obj) return true;

        if (Obj == null || getClass() != Obj.getClass()) {
            return false;
        }

        Order order = (Order) Obj;

        boolean rez = false;

        if (basket.length != order.basket.length)
            return rez;

        if (customer == order.customer) {
            if (basket[0] == null) return rez;
            else {
                for (int i = 0; i < basket.length; i++) {
                    if (Objects.equals(basket[i], order.basket[i]))
                        rez = true;
                    else return rez;
                }
            }
        }

        return rez;
    }
}
