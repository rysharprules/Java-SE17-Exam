package records.constructor_additional;

public record Product(long id, String name, String description) {

    // Additional constructors MUST call this(...)
    public Product(long id, String name) {
        this(id, name, null);
    }
}