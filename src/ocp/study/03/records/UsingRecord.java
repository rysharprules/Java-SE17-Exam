package records;
public class UsingRecord {
    public static void main(String[] args) {
        var product = new ProductRecord(1000123L, "Apples", "Tasty red apples");

        var productId = product.id();
        var productName = product.name();
        System.out.printf("Product %d has name: %s%n", productId, productName);

        System.out.println("Does it have a description? " + product.hasDescription());
    }
}
