package Pizzas;

public abstract class Pizza {

    String description;

    public String prepare()
    {
        return "Подготовлена ";
    }
    public String bake()
    {
        return "Испечена ";
    }
    public String cut()
    {
        return "Разрезана ";
    }
    public String box()
    {
        return "Упакована ";
    }
}
