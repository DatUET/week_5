package Week_5.question_2;

public class Square extends Retangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled)
    {
        super(color,filled,side,side);
        this.side=side;
    }

    public Square(double side) {
        super(side,side);
        this.side=side;
    }

    public Square() {
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLenght(double side) {
        super.setLenght(side);
    }

    @Override
    public String toString() {
        return "color: "+getColor()+"\tfilled: "+isFilled()+"\tSide = "+side+"\tArea = "+getArea()+"\tPerimeter = "+getPerimeter();
    }
}
