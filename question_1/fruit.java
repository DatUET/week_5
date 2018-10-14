package Week_5.question_1;

public class fruit {
    protected double price;
    protected String origin;
    protected String dateAdded;
    protected String id;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public fruit(double price, String origin, String dateAdded, String id) {
        this.price = price;
        this.origin = origin;
        this.dateAdded = dateAdded;
        this.id = id;
    }

    public fruit() {
    }

    public String toString(String name) {
        return "Tên: "+name+"\nID: "+id+"\nngiá: "+price+"nghìn đồng/cân"+"\nnguồn gốc: "+origin+"\nngày nhập: "+dateAdded;
    }
}
