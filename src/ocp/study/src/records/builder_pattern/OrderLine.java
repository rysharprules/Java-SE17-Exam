package records.builder_pattern;

import java.math.BigDecimal;

public record OrderLine(Product product, int quantity, BigDecimal price) {   
}
