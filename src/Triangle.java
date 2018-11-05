public class Triangle extends Shape{
    private double side1 = 3;
    private double side2 = 4;
    private double side3 = 5;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-side3)*(p-side2)*(p-side1));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "A Triangle with " +
                getSide1() + " and " +
                getSide2() + " and " +
                getSide3() + ", which is a subclass of " +
                super.toString();
    }
}
