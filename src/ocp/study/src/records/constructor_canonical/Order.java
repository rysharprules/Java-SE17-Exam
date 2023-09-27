package records.constructor_canonical;

import java.time.LocalDateTime;
import java.util.List;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    public Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {
        this.id = id;
        this.customer = customer;
        this.dateTime = dateTime;
        this.lines = List.copyOf(lines); // Defensive unmodifiable copy
    }

}

// Rules:
// - The canonical constructor's access level cannot be more restrictive than that of the record itself
// - The canonical constructor cannot have a 'throws' clause