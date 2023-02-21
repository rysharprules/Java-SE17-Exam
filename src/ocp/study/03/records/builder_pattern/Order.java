package records.builder_pattern;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//@Builder // Alternativly, use Lombok, with its 1.18.20 update, where they added support for the 
// record feature. Lombok provides a @Builder annotation
public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    public Order {
        lines = List.copyOf(lines);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long id;
        private Customer customer;
        private LocalDateTime dateTime;
        private List<OrderLine> lines = new ArrayList<>();

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder forCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder atDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public Builder addLine(OrderLine line) {
            this.lines.add(line);
            return this;
        }

        public Order build() {
            return new Order(id, customer, dateTime, lines);
        }
    }

}