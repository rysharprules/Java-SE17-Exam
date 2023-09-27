package records;
public final class Product {

    private final long id;
    private final String name;
    private final String description;

    public Product(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // @Override for equals(Object o) and hashCode() methods

}