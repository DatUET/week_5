package Week_5.question_1;

import Week_5.question_1.fruit;

public class orange extends fruit {

    private String name = "Cam thường";


    public orange()
    {
        super();
    }
    public orange (double price, String origin, String dateAdded, String id)
    {
        super(price,origin,dateAdded,id);
    }

    public String toString() {
        return super.toString(name);
    }
}
