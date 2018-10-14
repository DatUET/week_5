package Week_5.question_1;

public class Apple extends fruit {
    private String name = "Táo";

    public Apple()
    {
        super();
    }
    public Apple (double price, String origin, String dateAdded, String id)
    {
        super(price,origin,dateAdded,id);
    }

    public String toString()
    {
        return super.toString(name);
    }
}
