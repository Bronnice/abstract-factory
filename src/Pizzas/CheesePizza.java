package Pizzas;

public class CheesePizza extends Pizza{

    public CheesePizza()
    {
        description += "Сырная пицца ";
    }

    @Override
    public void prepare()
    {
        description += "Подготовлена для сырной ";
    }
}
