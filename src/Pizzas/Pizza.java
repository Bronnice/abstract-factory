package Pizzas;

public abstract class Pizza {

    String description = "";

    public void prepare()
    {
        description += "Подготовлена ";
    }
    public void bake()
    {
        description += "Испечена ";
    }
    public void cut()
    {
        description += "Разрезана ";
    }
    public void box()
    {
        description += "Упакована ";
    }
}
