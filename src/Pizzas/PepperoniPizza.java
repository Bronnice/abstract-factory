package Pizzas;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza()
    {
        description += "Пепперони пицца ";
    }

    @Override
    public void bake()
    {
        description += "Испечена для пеперони ";
    }
}


