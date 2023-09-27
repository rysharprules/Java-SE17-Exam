package pattern_matching;

interface Shape { }
record Rectangle(double length, double width) implements Shape { }
record Circle(double radius) implements Shape { }
record Triangle() implements Shape { }
public class PatternMatching {

    public static void main(String... args) {
        Circle circle = new Circle(1.0);
        Rectangle rectangle = new Rectangle(2.0, 3.5);
        Triangle triangle = new Triangle();
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        System.out.println(getPerimeter(circle));
        System.out.println(getPerimeter(shape1));

        System.out.println(getPerimeter(rectangle));
        System.out.println(getPerimeter(shape2));

        try {
            System.out.println(getPerimeter(triangle));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(getPerimeter((Shape) new Object()));
    }

    public static double getPerimeter(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle r) {
            return 2 * r.length() + 2 * r.width();
        } else if (shape instanceof Circle c) {
            return 2 * c.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }

    // Pattern Matching for switch Expressions and Statements is part of JEP 406, which is a preview feature in Java 17.
//    public static double getPerimeterWithSwitch(Shape shape) throws IllegalArgumentException {
//        return switch (shape) {
//            case Rectangle r -> 2 * r.length() + 2 * r.width();
//            case Circle c    -> 2 * c.radius() * Math.PI;
//            default          -> throw new IllegalArgumentException("Unrecognized shape");
//        }
//    }
}
