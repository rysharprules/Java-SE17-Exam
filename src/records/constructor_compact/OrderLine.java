package records.constructor_compact;

import java.math.BigDecimal;

public record OrderLine(Product product, int quantity, BigDecimal price) {   
}
