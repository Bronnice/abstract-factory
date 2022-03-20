import factory.PizzaStore;
import factory.SimplePizzaFactory;

public class Main {

    public static void main(String[] args) {

        SimplePizzaFactory spf = new SimplePizzaFactory();
        PizzaStore ps = new PizzaStore(spf);

        ///TODO Сделать отображение всех этапов готовки пиццы
        System.out.println(ps.orderPizza("Сыр"));
        System.out.println(ps.orderPizza("Пепперони"));
        System.out.println(ps.orderPizza("Мидии"));
        System.out.println(ps.orderPizza("Вегетерианская"));
    }
}