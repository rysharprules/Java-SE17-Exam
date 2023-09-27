package text_block;

public class TextBlocks {

    /*
    Hello1
    Hello2

       World!

    */
    public static void main(String[] args) {
        // Text block without a line break at the end
        String str1 = """
                Hello1""";

        // Text block with a line break at the end
        String str2 = """
                Hello2
                """;

        // Text block with three whitespace in the beginning and a line break at the end
        String str3 = """
                   World!
                """;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        concat();
        escapeChars();
        replaceableParameter();
    }

    /*
    Hello3 World!
    Hello3 World! Java rocks!
     */
    public static void concat() {
        System.out.println("");
        System.out.println("Concat Example:");

        String str1 = "Hello3 ";
        String str2 = """
                World!""";
        String str3 = """
                 Java rocks!
                """;
        System.out.println(str1 + str2);
        System.out.println(str1 + (str2 + str3));
    }

    /*
    <html>
        <head>
            <title>Hello World</title>
        </head>
        <body>
            Java
            rocks!
        </body>
    </html>
     */
    public static void escapeChars() {
        System.out.println("");
        System.out.println("Escape Chars Example:");
        String text = """
                <html>
                    <head>
                        <title>Hello World</title>
                    </head>
                    <body>
                        Java\n\t\trocks!
                    </body>
                </html>""";

        System.out.println(text);
    }

    // You can replace a parameter in the text block using %s or $<<replaceable-parameter>>
    /*
    What is the distance between earth and moon?
    What is the distance between earth and mercury?
    What is the distance between earth and moon?
    What is the distance between earth and moon?
     */
    public static void replaceableParameter() {
        System.out.println("");
        System.out.println("Replaceable Parameter Example:");
        String text = """
                What is the distance between %s and %s?""";

        System.out.println(String.format(text, "earth", "moon"));
        System.out.println(String.format(text, "earth", "mercury"));

        // Alternative-1
        text = """
                What is the distance between $celestial1 and $celestial2?""";

        System.out.println(text.replace("$celestial1", "earth").replace("$celestial2", "moon"));

        // Alternative-2 using the deprecated String#formatted
        text = """
                What is the distance between %s and %s?""";
        System.out.println(text.formatted("earth", "moon"));
    }
}