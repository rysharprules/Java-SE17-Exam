package records.constructor_canonical;

import java.math.BigDecimal;

public record OrderLine(Product product, int quantity, BigDecimal price) {   
}
