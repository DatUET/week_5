package Week_5.question_1;

import Week_5.question_1.fruit;

public class orangeCaoPhong extends fruit {

    private String name = "Cam Cao Phong";

    public orangeCaoPhong()
    {
        super();
    }
    public orangeCaoPhong (double price, String origin, String dateAdded, String id)
    {
        super(price,origin,dateAdded,id);
    }

    public String toString()
    {
        return super.toString(name);
    }
}
