package sealed_classes;

public sealed class Shape
    /*
        final: Cannot be extended further
        sealed: Can only be extended by its permitted subclasses
        non-sealed: Can be extended by unknown subclasses; a sealed class cannot prevent its permitted subclasses from doing this
     */
        permits Circle, Square, Rectangle {
}
