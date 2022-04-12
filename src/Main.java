import Fabrication.PizzaStore;
import Fabrication.SimplePizzaFactory;

public class Main {

    public static void main(String[] args) {

        SimplePizzaFactory spf = new SimplePizzaFactory();
        PizzaStore ps = new PizzaStore(spf);

        System.out.println(ps.orderPizza("Сыр"));
        System.out.println(ps.orderPizza("Пепперони"));
        System.out.println(ps.orderPizza("Мидии"));
        System.out.println(ps.orderPizza("Вегетерианская"));
    }
}