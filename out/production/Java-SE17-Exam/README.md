# 03. Utilizing Java Object-Oriented Approach

<!-- TOC -->
* [03. Utilizing Java Object-Oriented Approach](#03-utilizing-java-object-oriented-approach)
  * [03.01 - Declare and instantiate Java objects including nested class objects, and explain the object life-cycle including creation, reassigning references, and garbage collection](#0301---declare-and-instantiate-java-objects-including-nested-class-objects-and-explain-the-object-life-cycle-including-creation-reassigning-references-and-garbage-collection)
  * [03.02 - Create classes and records, and define and use instance and static fields and methods, constructors, and instance and static initializers](#0302---create-classes-and-records-and-define-and-use-instance-and-static-fields-and-methods-constructors-and-instance-and-static-initializers)
  * [03.03 - Implement overloading, including var-arg methods](#0303---implement-overloading-including-var-arg-methods)
  * [03.04 - Understand variable scopes, use local variable type inference, apply encapsulation, and make objects immutable](#0304---understand-variable-scopes-use-local-variable-type-inference-apply-encapsulation-and-make-objects-immutable)
    * [Immutable Objects](#immutable-objects)
  * [03.05 - Implement polymorphism and differentiate object type versus reference type. Perform type casting, identify object types using instanceof operator and pattern matching](#0305---implement-polymorphism-and-differentiate-object-type-versus-reference-type-perform-type-casting-identify-object-types-using-instanceof-operator-and-pattern-matching)
  * [03.06 - Create and use interfaces, identify functional interfaces, and utilize private, static, and default interface methods](#0306---create-and-use-interfaces-identify-functional-interfaces-and-utilize-private-static-and-default-interface-methods)
  * [03.07 - Create and use enumerations with fields, methods and constructors](#0307---create-and-use-enumerations-with-fields-methods-and-constructors)
<!-- TOC -->

## 03.01 - Declare and instantiate Java objects including nested class objects, and explain the object life-cycle including creation, reassigning references, and garbage collection

blah blah blah

## 03.02 - Create classes and records, and define and use instance and static fields and methods, constructors, and instance and static initializers

<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/Product.java">Immutable Class</a>, i.e., the old way<br />
<img src="../../../../img/icon_code.png"  width="5%"> <a href="records/ProductRecord.java">Record Class</a>, i.e., the new way. Note the comments regarding what the compiler generates.

**Class hierarchy of records**

- Records are implicitly `final`
- Records cannot extend classes, but can implement interfaces
- The common superclass for records is `java.lang.Record`

**Practical use for records**

- Domain Objects
- Value Objects (Examples: String, Integer, Long, BigInteger, BigDecimal, java.time).
    - A value object does not have an identity
- Data Transfer Objects

**Non-Use cases for records**

- Records CANNOT be used for JPA entities as JPA entity classes are required to be mutable, i.e., entities must not be `final`, must include a no-argument constructor, and the persistance fields cannot be `final`.  
- Records are not a direct replacement for JavaBeans - does not use the 'setter' and 'getter' naming convention. Also, not all JavaBeans are immutable.
- Singleton - The canonical constructor cannot be made `private`

## 03.03 - Implement overloading, including var-arg methods

blah blah blah

## 03.04 - Understand variable scopes, use local variable type inference, apply encapsulation, and make objects immutable

### Immutable objects

**Examples**

![Examples](../../../../img/03_immutable_classes_example.png)

**Advantages**

1. Programs are less complicated
1. Thread-safe
1. Collections such as HashMap and HashSet expect immutability
1. Objects can be safely shared and reused


## 03.05 - Implement polymorphism and differentiate object type versus reference type. Perform type casting, identify object types using instanceof operator and pattern matching

blah blah blah

## 03.06 - Create and use interfaces, identify functional interfaces, and utilize private, static, and default interface methods

blah blah blah

## 03.07 - Create and use enumerations with fields, methods and constructors

blah blah blah