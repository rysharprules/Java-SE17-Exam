package sealed_classes;

public sealed class Figure
        // The permits clause has been omitted
        // as its permitted classes have been
        // defined in the same file.
{ }

final class Circle1 extends Figure {
    float radius;
}
non-sealed class Square1 extends Figure {
    float side;
}
sealed class Rectangle1 extends Figure {
    float length, width;
}
final class FilledRectangle1 extends Rectangle1 {
    int red, green, blue;
}
