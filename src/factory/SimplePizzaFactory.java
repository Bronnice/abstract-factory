package factory;

import Pizzas.*;

public class SimplePizzaFactory
{

    public Pizza createPizza(String type)
    {
        Pizza pizza = null;

        switch (type) {
            case "Сыр":
                pizza = new CheesePizza();
                break;
            case "Пепперони":
                pizza = new PepperoniPizza();
                break;
            case "Мидии":
                pizza = new ClamPizza();
                break;
            case "Вегетерианская":
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }
}
