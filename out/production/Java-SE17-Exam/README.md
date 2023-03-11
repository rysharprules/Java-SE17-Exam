# Handling date, time, text, numeric and boolean values

## Use primitives and wrapper classes including Math API, parentheses, type promotion, and casting to evaluate arithmetic and boolean expression

- [Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [The Number Classes](https://docs.oracle.com/javase/tutorial/java/data/numberclasses.html)
- [Beyond Basic Arithmetic](https://docs.oracle.com/javase/tutorial/java/data/beyondmath.html) 
- [Autoboxing and Unboxing](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html)
- [java/lang/Math API docs](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Math.html)
- [A Guide to the Java Math Class](https://www.baeldung.com/java-lang-math)
- [Type conversion in Java with Examples](https://www.geeksforgeeks.org/type-conversion-java-examples/)
- [Object Type Casting in Java](https://www.baeldung.com/java-type-casting)
- [Pattern Matching for instanceof in Java 14](https://www.baeldung.com/java-pattern-matching-instanceof)
- [Java.lang.Boolean Class in Java](https://www.geeksforgeeks.org/java-lang-boolean-class-java/)

## Manipulate text, including text blocks, using String and StringBuilder classes

### Manipulate text with String

- [Strings](https://docs.oracle.com/javase/tutorial/java/data/strings.html)
- [Manipulating Characters in a String](https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html)

### Text blocks

- [Java Text Blocks](https://www.baeldung.com/java-text-blocks)

**What is a text block?**

A text block is a multi-line string literal and the feature offers a clean way to format the string in a predictable
way, without using most of the escape sequences. It starts and ends with a """ (three double-quotes marks) e.g.

```
public class Main {
    public static void main(String[] args) {
        String text = """
            <html>
                <head>
                    <title>Hello World</title>
                </head>
                <body>
                    Java rocks!
                </body>
            </html>""";
    
            System.out.println(text);
    }
}
```

Output:

```
<html>
    <head>
        <title>Hello World</title>
    </head>
    <body>
        Java rocks!
    </body>
</html>
```

A text block begins with **three double-quote characters followed by a line terminator** which is not the case with 
the traditional string representation. It means:

1. The text block can not be put on a single line.
1. The content of the text block can not follow the three opening double-quotes on the same line.

```
String str = "Hello World!"; // The traditional string

String textBlock = """
        Hello World!
        """; // The text block

String notAllowed1 = """Hello World!"""; // Error

// The following code will fail compilation
String notAllowed2 ="""Hello
         World!
        """;
```

The compiler shifts the complete text block to the left and then retains the specified spacing.

```
String str1 = """
           Hello
        """;
        ^^^<-----The three whitespace characters before Hello will be retained
```

_Essential whitespace_ is part of your String and is important to you. _Incidental
whitespace_ just happens to be there to make the code easier to read. You can reformat
your code and change the amount of incidental whitespace without any impact on your
String value.

Imagine a vertical line drawn on the leftmost non-whitespace character in your text
block. Everything to the left of it is incidental whitespace, and everything to the right is
essential whitespace.

| Formatting                     | Meaning in regular String                                          | Meaning in text block       |
|--------------------------------|--------------------------------------------------------------------|-----------------------------|
| \"                             | "                                                                  | "                           |
| \"""                           | n/a - Invalid                                                      | """                         |
| \"\"\"                         | """                                                                | """                         |
| Space (at the end of the line) | Space                                                              | Ignored                     |
| \s                             | Two spaces (\s is a space and preserves leading space on the line) | Two spaces                  |
| \ (at end of line)             | n/a - Invalid                                                      | Omits new line on that line |

**Are they stored in string pool?**
Yes, they are. The text blocks are compiled to the same type as that of the traditional String value i.e. 
the byte code does not distinguish between a traditional String value and text block

### StringBuilder

- [The StringBuilder Class](https://docs.oracle.com/javase/tutorial/java/data/buffers.html)

## Manipulate date, time, duration, period, instant and time-zone objects using Date-Time API 

- [Standard Calendar](https://docs.oracle.com/javase/tutorial/datetime/iso/index.html)
