# Utilizing Java Object-Oriented Approach

## Declare and instantiate Java objects including nested class objects, and explain the object life-cycle including creation, reassigning references, and garbage collection

blah blah blah

## Create classes and records, and define and use instance and static fields and methods, constructors, and instance and static initializers

**Record class and its usage**

<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/Product.java">Immutable Class</a>, i.e., the old way<br />
<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/ProductRecord.java">Record Class</a>, i.e., the new way. Note the comments regarding what the compiler generates.<br />
<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/UsingRecord.java">UsingRecord.java</a> - an example of creating an instance of a record and calling its methods.<br />

```
public record Product(long id, String name, String description) {
}
```

**Canonical constructor**

The compiler creates a constructor for you, called the canonical constructor. This constructor takes the components of your record as arguments and copies their values to the fields of the record class.

<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/constructor_canonical/Order.java">Order.java</a> - an example of an override of the canonical constructor. You would do this when you need to validate the state of your record
or if you need to make a defensive copy of a mutable component.<br />

```
    public Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {
        this.id = id;
        this.customer = customer;
        this.dateTime = dateTime;
        this.lines = List.copyOf(lines); // Defensive unmodifiable copy
    }
```

**Compact constructor**

The compact canonical constructor does not need to declare its block of parameters.

```
public Order {
        // compiler will initialize instance variables with argument variables
        lines = List.copyOf(lines); // assign to the argument variable to overwrite
}
```

Note that if you choose this syntax, you cannot directly assign the record's fields, for example with `this.lines` - that is done for you by code added by the compiler. But you can assign new values to the parameters, which leads to the same result because the compiler-generated code will then assign these new values to the fields.

<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/constructor_compact/Order.java">Order.java</a> - an example of an override of the canonical constructor using a compact constructor.<br />

**Additional constructors**

<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/constructor_additional/Product.java">Additional constructors</a> must call `this`.

```
public Product(long id, String name) {
        this(id, name, null);
    }
```

**Builder pattern**

<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/builder_pattern/Order.java">an example of a record with a builder pattern</a>.

### Class Hierarchy of Records

- Records are implicitly `final`
- Records cannot extend classes, but can implement interfaces
- The common superclass for records is `java.lang.Record`

### Practical use for Records

- Domain Objects
- Value Objects (Examples: String, Integer, Long, BigInteger, BigDecimal, java.time).
    - A value object does not have an identity
- Data Transfer Objects

#### Non-Use cases for Records

- Records CANNOT be used for JPA entities as JPA entity classes are required to be mutable, i.e., entities must not be `final`, must include a no-argument constructor, and the persistance fields cannot be `final`.  
- Records are not a direct replacement for JavaBeans - does not use the 'setter' and 'getter' naming convention. Also, not all JavaBeans are immutable.
- Singleton - The canonical constructor cannot be made `private`

## Implement overloading, including var-arg methods

blah blah blah

## Understand variable scopes, use local variable type inference, apply encapsulation, and make objects immutable

### Immutable Objects

#### Examples

![Examples](../../../../img/03_immutable_classes_example.png)

#### Advantages

1. Programs are less complicated
1. Thread-safe
1. Collections such as HashMap and HashSet expect immutability
1. Objects can be safely shared and reused


## Implement polymorphism and differentiate object type versus reference type. Perform type casting, identify object types using instanceof operator and pattern matching

blah blah blah

## Create and use interfaces, identify functional interfaces, and utilize private, static, and default interface methods

blah blah blah

## Create and use enumerations with fields, methods and constructors

blah blah blah