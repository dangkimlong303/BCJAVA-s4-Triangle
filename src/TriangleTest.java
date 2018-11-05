public class TriangleTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        System.out.println(((Triangle) triangle).getArea());
        System.out.println(((Triangle) triangle).getPerimeter());
        System.out.println(triangle);

        triangle = new Triangle();
        triangle.setColor("blue");
        triangle.setFilled(false);
        ((Triangle) triangle).setSide1(9);
        ((Triangle) triangle).setSide2(2);
        ((Triangle) triangle).setSide3(8);

        System.out.println(((Triangle) triangle).getArea());
        System.out.println(((Triangle) triangle).getPerimeter());
        System.out.println(triangle);
    }
}
