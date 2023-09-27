package records;
public record ProductRecord(long id, String name, String description) {

        // Compiler translates this to a final class
        // with private final fields

        // Compiler generates a constructor that initializes the fields. This is called
        // the Canonical Constructor

        // Compiler generates accessor methods:
        // public long id() { return this.id; }
        // public String name() { return this.name; }
        // public String description() { return this.description; }
        // These can be overridden:
        @Override
        public String name() {
                return name != null && !name.isBlank() ? name : "anonymous";
        }
        // Although there are rules when overriding:
        // - The return type of an overridden accessor method must be the same type of the component
        // - Accessor methods cannot have a 'throws' clause (so they cannot throw checked exceptions).
        //      They can throw unchecked exceptions

        // toString methods are generated:
        // example output: ProductRecord[id=500567, name=Apples, description=Tasty red apples]
        // Note: this calls the variables directly, not the accessor methods

        // Instance fields are NOT allowed
        // private int value; // NO!

        // Static fields are allowed
        private static int VALUE = 25;

        // you CANNOT add initilizer blocks but you CAN add static initializer blocks

        public boolean hasDescription() {
                return description != null && !description.isBlank();
        }
}