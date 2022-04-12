package Pizzas;

public class VeggiePizza extends Pizza{

    public VeggiePizza()
    {
        description += "Вегетерианская пицца ";
    }

    @Override
    public void box()
    {
        description += "Упакована для вегетерианской ";
    }
}
