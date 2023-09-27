package records.constructor_compact;

import java.time.LocalDateTime;
import java.util.List;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    public Order {
        // compiler will initialize instance variables with argument variables
        lines = List.copyOf(lines); // assign to the argument variable to overwrite
    }

}