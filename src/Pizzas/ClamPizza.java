package Pizzas;

public class ClamPizza extends Pizza{

    public ClamPizza()
    {
        description += "Пицца с мидиями ";
    }

    @Override
    public void cut()
    {
        description += "Разрезана для пиццы с мидиями ";
    }
}
