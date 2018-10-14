package Week_5.question_1;

import Week_5.question_1.fruit;

public class orangeSanh extends fruit {
    private String name = "Cam Sành";

    public orangeSanh()
    {
        super();
    }
    public orangeSanh (double price, String origin, String dateAdded, String id)
    {
        super(price,origin,dateAdded,id);
    }

    public String toString()
    {
        return super.toString(name);
    }
}
